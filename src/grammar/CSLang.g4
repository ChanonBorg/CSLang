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
| printOut
| loop
;

declaration
: 'cs' ID;

assignment
: ID 'is' expression;

expression
: unaryExpression
| addExpression;

addExpression
: unaryExpression 'plus' expression;

unaryExpression
: ID
| INT
;

loop
: startLoop code stopLoop; // när vi kör exit loop kolla värdet counter

startLoop // hur förstår kompilatorn att den ska loopa?
: 'solong' condition;

stopLoop // exit stoploop kolla värdet på count
: 'stoploop';

condition
: unaryExpression unaryExpression comparison; // loop + antal ggr

comparison
: 'lt'
| 'gt'
| 'eq';

printOut
: 'write' ID
| 'wite' INT;

ID:	('a'..'z')+;
INT: ('0'..'9')+ ;
WS:	[ \n\t\r]+ -> skip ;