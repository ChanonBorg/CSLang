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
| startloop
| stoploop
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
: startloop assignment; // loop + vad som ska loopas

startloop // hur förstår kompilatorn att den ska loopa?
: 'startloop' expression expression; // loop + antal ggr

stoploop
:'stoploop';

printout
: 'write' ID;

ID:	('a'..'z')+;
INT: ('0'..'9')+ ;
WS:	[ \n\t\r]+ -> skip ;