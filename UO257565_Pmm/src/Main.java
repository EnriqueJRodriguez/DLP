import parser.*;

import org.antlr.v4.runtime.*;

import ast.Program;
import ast.ErrorHandler;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import visitor.IdentificationVisitor;
import visitor.LValueVisitor;

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
		LValueVisitor lValueVisitor = new LValueVisitor();
		IdentificationVisitor identificationVisitor = new IdentificationVisitor();
		ast.accept(lValueVisitor,null);
		ast.accept(identificationVisitor, null);
		
		// * Check errors 
		if(ErrorHandler.getInstance().anyError()){
			// * Show errors
			ErrorHandler.getInstance().showErrors(System.err);
		}
		else{			
			// * The AST is shown
			IntrospectorModel model=new IntrospectorModel("Program", ast);
			new IntrospectorTree("Introspector", model);
		}		
	}
}
