grammar CSLang;  // Detta är vår lexer med lexer rules

file
: code EOF
;
code
: statement '|' code
;

statement
: declaration
| assignment
| printout
;

declaration
: 'cs' ID
;

assignment
: ID 'is' INT
| ID 'is' ID
| ID 'is' addExpression
;

addExpression
: ID 'plus' INT
| ID 'plus' ID
| INT 'plus' ID
| INT 'plus' INT
;

printout
: 'write' ID
;

ID:	('a'..'z''A'..'Z')+;
INT: ('0'..'9')+ ;
WS:	[ \n\t\r]+ -> skip ;

// härma i hur man hanterar White space, INT.