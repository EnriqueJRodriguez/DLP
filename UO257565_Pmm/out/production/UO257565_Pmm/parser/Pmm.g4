grammar Pmm;	

program: EOF
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
