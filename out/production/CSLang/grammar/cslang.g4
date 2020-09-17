grammar cslang;

file
: code EOF
;
code
: statement '!' code
;

statement
: declaration
| assignment
| printout
;

declaration
: 'Hallå' ID
;

assignment
: ID 'är' INT
| ID 'är' ID
| ID 'är' addExpression
;

addExpression
: ID 'och' INT
| ID 'och' ID
| INT 'och' ID
| INT 'och' INT
;

printout
: 'skriv ut' ID
;

ID:	('a'..'z')+ ;
INT: ('0'..'9')+ ;
WS:	[ \n\t\r]+ -> skip ;

// härma i hur man hanterar White space, INT.