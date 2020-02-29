grammar Pmm;	

program: ( variable_definition| function_definition)* EOF;

variable_definition : identifiers ':' simple_type ';'
            	  | identifiers ':' 'struct' '{' (variable_definition )+ '}' ';'
            	  | identifiers ':' ('[' i1=INT_CONSTANT ']' )+ (simple_type | 'struct' '{' (variable_definition )+ '}' ) ';'
                  ;

identifiers : ID  (',' ID )*;

function_definition : 'def' ID '(' (ID ':' simple_type (',' ID ':' simple_type )*)? ')' ':' (simple_type )? '{' function_body '}'
                    ;

function_body : (variable_definition)*(statement)*;


statement : expression '=' expression ';'
		  | 'print' expression (',' expression )* ';'
		  | 'input'expression (',' expression )* ';'
		  | 'return' expression ';'
		  | 'if' expression ':' ('{' (statement )+ '}'| statement | '{' statement '}') ('else' ('{' (statement )+ '}'| statement )| '{' statement '}')?
		  | 'while' expression ':' ('{' (statement )+ '}'| statement )
		  | ID '('(expression (',' expression )*)? ')'';'
		  ;

expression :  '(' expression ')'
		   | ID '('(expression (',' expression  )*)? ')'
		   | expression '[' expression']'
		   | expression '.' ID
		   | '(' simple_type ')' expression
		   | '-' expression
		   | '!' expression
		   | expression ('*'|'/'|'%') expression
		   | expression ('+'|'-') expression
		   | expression ('>'|'>='|'<'|'<='|'!='|'==') expression
		   | expression ('&&'|'||') expression
		   | INT_CONSTANT
		   | REAL_CONSTANT
		   | CHAR_CONSTANT
		   | ID
		   ;

simple_type:'int'
 		|'double'
 		|'char'
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

DECIMAL: INT_CONSTANT? '.' DIGIT+
	   | INT_CONSTANT '.'(DIGIT+)?
	   ;

CHAR_CONSTANT: QUOTE (~ '\'') QUOTE
			| QUOTE ESCAPE DIGIT+ QUOTE
			| QUOTE ESCAPE[nt]QUOTE
			;

EXPONENT: [Ee] [+-]? DIGIT+
		;

DIGIT: [0-9]
	 ;

LETTER: [a-zA-Z]
	  ;

QUOTE: '\''
	 ;

ESCAPE: '\\'
	  ;
