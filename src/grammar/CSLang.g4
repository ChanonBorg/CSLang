grammar CSLang;  // Detta är vår lexer med lexer rules

file
: code
| EOF;

code
: statement '?' code
| statement '?'; // '?' radavslut.

statement
: declaration
| assignment
| printout
| sum
;

declaration
: 'cs' ID;

assignment
: ID 'is' expression;

expression
: ID
| INT
| addExpression;

addExpression
: unaryExpression 'plus' expression;

unaryExpression
: ID
| INT
;
sum
: loop expression; // deklaration + antal ggr loopen ska köras + värdet som ska loopas + räknare.

loop // hur förstår kompilatorn att den ska loopa?
: 'loop' expression;

printout
: 'write' ID;

ID:	('a'..'z')+;
INT: ('0'..'9')+ ;
WS:	[ \n\t\r]+ -> skip ;