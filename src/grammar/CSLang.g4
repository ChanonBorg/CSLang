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

arithmetic
: 'lesst'
| 'greatt'
;

addExpression
: unaryExpression 'plus' expression;

unaryExpression
: ID
| INT
;
sum
: startloop assignment; // loop + vad som ska loopas

startloop // hur förstår kompilatorn att den ska loopa?
: 'startloop' unaryExpression arithmetic unaryExpression; // loop + antal ggr

stoploop
:'stoploop';

comparision

printout
: 'write' unaryExpression;

ID:	('a'..'z')+;
INT: ('0'..'9')+ ;
WS:	[ \n\t\r]+ -> skip ;