grammar Pmm;	

@parser::header { import ast.*;
				  import ast.definitions.*;
				  import ast.expressions.*;
				  import ast.statements.*;
				  import ast.types.*;
				  import java.util.List;
				  import java.util.ArrayList;}

program returns [Program ast] : {List<Definition> definitions = new ArrayList<Definition>();}
                                    ( vd=variable_definition {for(VariableDefinition v : $vd.ast) {definitions.add(v);}}
                                        | fd=function_definition {definitions.add($fd.ast);}
                                    )*
                                    def='def' main='main()' ':' '{' function_body '}' EOF
                                    {definitions.add(new FunctionDefinition($def.getLine(),$def.getCharPositionInLine()+1,$function_body.ast,
                                                                        new FunctionType($def.getLine(),$def.getCharPositionInLine()+1,
                                                                        new VoidType($main.getLine(),$main.getCharPositionInLine()+1),
                                    									new ArrayList<VariableDefinition>()),"main"));}
                                    {$ast = new Program(definitions.get(0).getLine(), definitions.get(0).getColumn(),definitions);};




variable_definition returns [List<VariableDefinition> ast = new ArrayList<VariableDefinition>()]: identifiers def=':' st1=simple_type ';'
                                                                                                    { for(String id : $identifiers.ast) {
                                                                                                            $ast.add(new VariableDefinition($def.getLine(), $def.getCharPositionInLine() + 1,
                                                                                                                                            id,$st1.ast));
                                                                                                        }
                                                                                                    }
            	                                                                                | identifiers def=':' st='struct'
            	                                                                                    {List<VariableDefinition> variables = new ArrayList<VariableDefinition>();
                                                                                                     List<FieldDefinition> fields = new ArrayList<FieldDefinition>();}
            	                                                                                    '{' (vds=variable_definition
            	                                                                                        {for(VariableDefinition vd : $vds.ast) {
            	                                                                                            if(variables.contains(vd)) {
                                                                                                            	new ErrorType(vd.getLine(), vd.getColumn(), "Variable " + vd.getName() +" repeated");
                                                                                                            } else{
                                                                                                        	    variables.add(vd);
                                                                                                        	    fields.add(new FieldDefinition(vd.getLine(), vd.getColumn(), vd.getName(), vd.getType()));
                                                                                                        	  }
                                                                                                        	}
                                                                                                        }
            	                                                                                    )+ '}' ';'
            	                                                                                    { for(String id : $identifiers.ast) {
                                                                                                    		$ast.add(new VariableDefinition($def.getLine(), $def.getCharPositionInLine() + 1,
                                                                                                    		         id,new Struct($st.getLine(), $st.getCharPositionInLine() + 1, fields)));
                                                                                                        }
                                                                                                    }
            	                                                                                | identifiers def=':' {List<Integer> sizes = new ArrayList<Integer>(); }
            	                                                                                    ('[' ic=INT_CONSTANT ']' {sizes.add(LexerHelper.lexemeToInt($ic.text));})+
            	                                                                                    {Type t; }
            	                                                                                    (simple_type {t=$simple_type.ast;}
            	                                                                                        |
            	                                                                                    st='struct' '{' {List<FieldDefinition> fields = new ArrayList<FieldDefinition>();}
            	                                                                                    (vds=variable_definition
            	                                                                                        {for(VariableDefinition vd : $vds.ast) {
                                                                                                        	fields.add(new FieldDefinition(vd.getLine(), vd.getColumn(),
                                                                                                        	            vd.getName(), vd.getType()));
                                                                                                            }
                                                                                                        }
            	                                                                                    )+ '}' {t=new Struct($st.getLine(), $st.getCharPositionInLine() + 1, fields);} ) ';'
            	                                                                                    {
                                                                                                    	int dimension = sizes.size()-1;
                                                                                                    	ArrayType array = new ArrayType($def.getLine(), $def.getCharPositionInLine() + 1, sizes.get(0), null);
                                                                                                    	ArrayType d = array;
                                                                                                    	while(dimension>1) {
                                                                                                    	    ArrayType array2 = new ArrayType($def.getLine(),$def.getCharPositionInLine() + 1,
                                                                                                    	                        sizes.get(sizes.size()-dimension), null);
                                                                                                    		array.setType(array2);
                                                                                                    		array = array2;
                                                                                                    		dimension--;
                                                                                                    	}
                                                                                                    	if(dimension == 0) {
                                                                                                    		array.setType(t);
                                                                                                    	} else {
                                                                                                    		array.setType(new ArrayType($def.getLine(),$def.getCharPositionInLine() + 1,
                                                                                                    		                        sizes.get(sizes.size()-dimension), t));
                                                                                                    	}
                                                                                                    	for(String id : $identifiers.ast) {
                                                                                                    		$ast.add(new VariableDefinition($def.getLine(), $def.getCharPositionInLine() + 1,id,d));
                                                                                                    	}
                                                                                                    }
                                                                                                ;

identifiers returns [List<String> ast = new ArrayList<String>()] : id1=ID  {$ast.add($id1.text);}
                                                                   (',' id2=ID
                                                                   {if($ast.contains($id2.text)) {
                                                                    new ErrorType($id1.getLine(), $id1.getCharPositionInLine() + 1, "Variable " + $id2.text +" repeated");
                                                                   } else {
                                                                     $ast.add($id2.text);
                                                                   }})*;

function_definition returns [FunctionDefinition ast] : def='def' name=ID '(' {List<VariableDefinition> variables = new ArrayList<VariableDefinition>();}
                                                           (id1=ID ':' st1=simple_type {variables.add(new VariableDefinition($id1.getLine(), $id1.getCharPositionInLine() + 1,$id1.text,$st1.ast));}
                                                           (',' id2=ID ':' st2=simple_type {variables.add(new VariableDefinition($id1.getLine(), $id1.getCharPositionInLine() + 1, $id2.text,$st2.ast));})*)?
                                                           ')' ':' {Type t = new VoidType($def.getLine(), $def.getCharPositionInLine() + 1);}
                                                           (st3=simple_type { t = $st3.ast;} )?
                                                           {List<Statement> statements = new ArrayList<Statement>();}
                                                           '{' function_body {statements = $function_body.ast;}'}'
                                                           {$ast = new FunctionDefinition($def.getLine(), $def.getCharPositionInLine()+1,
                                                                statements, new FunctionType( $def.getLine(), $def.getCharPositionInLine()+1,t, variables),$name.text); }
                                                      ;

function_body returns [List<Statement> ast = new ArrayList<Statement>()]: (variable_definition
                                                                           {for(VariableDefinition vd : $variable_definition.ast) {
                                                                           		$ast.add(vd);
                                                                           		}
                                                                           })*
                                                                           (stm=statement
                                                                           {
                                                                                for(Statement s : $stm.ast){
                                                                                    $ast.add(s);
                                                                                }
                                                                           })*
                                                                           ;


statement returns [List<Statement> ast = new ArrayList<Statement>()]: e1=expression '=' e2=expression ';'
                                        { $ast.add(new Assignment($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast, $e2.ast));}
		                         | 'print' {List<Expression> parameters = new ArrayList<Expression>();}
		                                e1=expression {parameters.add($e1.ast);} (',' e2=expression {parameters.add($e2.ast);})* ';'
		                                {
                                            for(Expression expression : parameters){
                                                $ast.add(new Write( $e1.ast.getLine(), $e1.ast.getColumn(), expression));
                                            }
		                                }
		                         | 'input' {List<Expression> parameters = new ArrayList<Expression>();}
                                 	    e1=expression {parameters.add($e1.ast);} (',' e2=expression {parameters.add($e2.ast);})* ';'
                                 	    {
                                            for(Expression expression : parameters){
                                                $ast.add(new Read( $e1.ast.getLine(), $e1.ast.getColumn(), expression));
                                            }
                                        }
		                         | 'return' e1=expression ';' { $ast.add(new ReturnStatement( $e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast));}
		                         | 'if' e1=expression ':'
		                                {List<Statement> stms1 = new ArrayList<Statement>();
                                         List<Statement> stms2 = new ArrayList<Statement>();}
		                                ('{' (st1=statement
		                                    {
                                                for(Statement s : $st1.ast){
                                                        stms1.add(s);
                                                }
                                            }
		                                )+ '}'
		                                | st2=statement
		                                    {
                                                for(Statement s : $st2.ast){
                                                    stms1.add(s);
                                                }
                                            }
		                                | '{' st5=statement
		                                    {
                                                for(Statement s : $st5.ast){
                                                    stms1.add(s);
                                                }
                                            }
                                        '}' )
		                                ('else' ('{' (st3=statement
		                                    {
                                                for(Statement s : $st3.ast){
                                                    stms2.add(s);
                                                }
                                            }
		                                )+ '}'
		                                | st4=statement
		                                    {
                                                for(Statement s : $st4.ast){
                                                    stms2.add(s);
                                                }
                                            }
		                                )
		                                | '{' st6=statement
		                                    {
                                                for(Statement s : $st6.ast){
                                                    stms2.add(s);
                                                }
                                            }
		                                '}')?
		                                {$ast.add(new IfStatement($e1.ast.getLine(), $e1.ast.getColumn(), stms1, stms2, $e1.ast));}
		                         | 'while' e1=expression {List<Statement> stms = new ArrayList<Statement>();}':'
		                                ('{' (st1=statement
		                                    {
                                                for(Statement s : $st1.ast){
                                                    stms.add(s);
                                                }
                                            }
		                                )+ '}'
		                                |
		                                st2=statement
		                                    {
                                                for(Statement s : $st2.ast){
                                                    stms.add(s);
                                                }
                                            }
		                                )
		                                {$ast.add(new While($e1.ast.getLine(), $e1.ast.getColumn(), stms, $e1.ast)); }
		                         | ID '(' {List<Expression> parameters = new ArrayList<Expression>();}
		                                (e1=expression {parameters.add($e1.ast);} (',' e2=expression {parameters.add($e2.ast);} )*)? ')'';'
                                        { $ast.add(new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine() + 1,
                                                                        parameters,new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text)));}
		                         ;

expression returns [Expression ast] :  '(' e1=expression ')' { $ast = $e1.ast; }
		                            | ID '(' {List<Expression> parameters = new ArrayList<Expression>();}
		                                (e1=expression {parameters.add($e1.ast);}  (',' e2=expression {parameters.add($e2.ast);} )*)? ')'
                                        { $ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine() + 1,
                                                                        parameters, new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text));
                                        }
		                            | e1=expression '[' e2=expression']' {$ast = new ArrayAccess($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast, $e2.ast);}
		                            | e1=expression '.' ID {$ast = new FieldAccess($e1.ast.getLine(),$e1.ast.getColumn(), $e1.ast, $ID.text);}
		                            | '(' simple_type ')' e1=expression {$ast = new Cast($e1.ast.getLine(),$simple_type.ast.getColumn(),$e1.ast, $simple_type.ast);}
		                            | '-' e1=expression {$ast = new UnaryMinus($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast);}
		                            | '!' e1=expression {$ast = new UnaryNegation($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast);}
		                            | e1=expression operator=('*'|'/'|'%') e2=expression { $ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(),$operator.text, $e1.ast, $e2.ast);}
		                            | e1=expression operator=('+'|'-') e2=expression { $ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(),$operator.text, $e1.ast, $e2.ast);}
		                            | e1=expression operator=('>'|'>='|'<'|'<='|'!='|'==') e2=expression { $ast = new Comparison($e1.ast.getLine(), $e1.ast.getColumn(),$operator.text, $e1.ast, $e2.ast);}
		                            | e1=expression operator=('&&'|'||') e2=expression { $ast = new Logical($e1.ast.getLine(), $e1.ast.getColumn(),$operator.text, $e1.ast, $e2.ast);}
		                            | INT_CONSTANT { $ast = new IntLiteral($INT_CONSTANT.getLine(),$INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text));}
		                            | REAL_CONSTANT { $ast = new RealLiteral($REAL_CONSTANT.getLine(),$REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
		                            | CHAR_CONSTANT { $ast = new CharLiteral($CHAR_CONSTANT.getLine(),$CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
		                            | ID { $ast = new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1,$ID.text); }
		                            ;

simple_type returns [Type ast]:'int'    {$ast = Int.getInstance();}
 		                      |'double' {$ast = Real.getInstance();}
 		                      |'char'   {$ast = Char.getInstance();}
 	                          ;
  		 
TRASH: [ \r\n\t] -> skip;

ONELINECOMMENTARY: '#'.*?('\n' | EOF) -> skip;

MULTIPLELINESCOMMENT: '"""'.*?'"""' -> skip;

ID: (LETTER | '_' )(LETTER | DIGIT|'_')*
  ;

INT_CONSTANT: [1-9] DIGIT*
			| '0'
            ;

REAL_CONSTANT: (INT_CONSTANT | DECIMAL) EXPONENT?
			 ;

fragment
DECIMAL: INT_CONSTANT? '.' DIGIT+
	   | INT_CONSTANT '.'(DIGIT+)?
	   ;

CHAR_CONSTANT: QUOTE (~ '\'') QUOTE
			| QUOTE ESCAPE DIGIT+ QUOTE
			| QUOTE ESCAPE[nt]QUOTE
			;

fragment
EXPONENT: [Ee] [+-]? DIGIT+
		;

fragment
DIGIT: [0-9]
	 ;

fragment
LETTER: [a-zA-Z]
	  ;

fragment
QUOTE: '\''
	 ;
fragment
ESCAPE: '\\'
	  ;
