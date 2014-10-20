grammar minipGrammar;

//minimales Programm und Einstiegspunkt
start:
         PROGRAMSYMBOL 
            declaration
         BEGINSYMBOL 
            programmcode
         ENDSYMBOL;

//Declaration einer Variablen
declaration : (CONSTANTSYMBOL IDSYMBOL (LISTCUTSYMBOL IDSYMBOL)* CMDENDSYMBOL)*;

//Programmcode
programmcode : (anweisung CMDENDSYMBOL)*;
anweisung : zuweisung;
zuweisung : IDSYMBOL ZUWEISUNGSSYMBOL zuweisungvalue;
zuweisungvalue : INTEGERCONST | REALCONST | STRINGCONST | BOOLEANCONST;

//SYMBOLE

PROGRAMSYMBOL : 'program';
BEGINSYMBOL : 'begin';
ENDSYMBOL : 'end';

//CONSTANTS
CONSTANTSYMBOL : 'string' | 'integer' | 'real'| 'boolean';
INTEGERCONST : VORZEICHENSYMBOL? DIGIT+;
REALCONST : INTEGERCONST '.' DIGIT*;
STRINGCONST: '(\'' .* '\')';
BOOLEANCONST : 'true' | 'false';

IDSYMBOL : LETTER (LETTER | DIGIT | '_')*;

VORZEICHENSYMBOL : '+' | '-';
ZUWEISUNGSSYMBOL : ':=';
LISTCUTSYMBOL : ',';
CMDENDSYMBOL : ';';

//Ignoring Linebreacks and Whitespaces
INGORINGSYMBOLS: (' ' | '\n' | '\r' | '\t') {skip();};

fragment LETTER : CAPITALLETTER | SMALLLETTER;
fragment CAPITALLETTER : 'A'..'Z';
fragment SMALLLETTER : 'a'..'z';
fragment DIGIT : '0'..'9';