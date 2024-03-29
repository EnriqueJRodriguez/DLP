import codegeneration.CodeGenerator;
import codegeneration.ExecuteCGVisitor;
import codegeneration.OffsetVisitor;
import parser.*;

import org.antlr.v4.runtime.*;

import ast.Program;
import ast.ErrorHandler;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import visitor.IdentificationVisitor;
import visitor.TypeCheckingVisitor;

public class Main {
	
	public static void main(String... args) throws Exception {
		   if (args.length<1) {
		        System.err.println("Please, pass me the input file.");
		        return;
		    }
		   		 			
		 // create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		PmmLexer lexer = new PmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		PmmParser parser = new PmmParser(tokens);	
		Program ast = parser.program().ast;
		IdentificationVisitor identificationVisitor = new IdentificationVisitor();
		OffsetVisitor offsetVisitor = new OffsetVisitor();
		TypeCheckingVisitor typeCheckingVisitor = new TypeCheckingVisitor();
		ast.accept(identificationVisitor, null);
		ast.accept(typeCheckingVisitor,null);
		ast.accept(offsetVisitor, null);

		// * Check errors 
		if(ErrorHandler.getInstance().anyError()){
			// * Show errors
			ErrorHandler.getInstance().showErrors(System.err);
		}
		else{
			ExecuteCGVisitor exVisitor = new ExecuteCGVisitor(new CodeGenerator(args[0], args[1]));
			ast.accept(exVisitor, null);
			// * The AST is shown
			IntrospectorModel model=new IntrospectorModel("Program", ast);
			new IntrospectorTree("Introspector", model);
		}		
	}
}
