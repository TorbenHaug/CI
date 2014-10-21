grammar minipGrammar;


start:
         PROGRAMSYMBOL 
            declaration
         BEGINSYMBOL 
            programmcode
         ENDSYMBOL;
//Declaration einer Variablen
declaration 	: (CONSTANTSYMBOL ID (LISTCUTSYMBOL ID)* CMDENDSYMBOL)*;

//Programmcode
programmcode 	: anweisung*;
anweisung 	: zuweisung | condition | schleife | println | read;

// Zuwweisung
zuweisung 	: ID ZUWEISUNGSSYMBOL zuweisungvalue CMDENDSYMBOL;
zuweisungvalue 	: STRINGCONST | BOOLEANCONST | vergleich | arithausdr; // INTEGERCONST | REALCONST |  entfernt, da es durch den arithausdr ersetzt wird. 

//Conditon
condition 	: IFSYMBOL vergleich THENSYMBOL programmcode (ELSESYMBOL programmcode)? FISYMBOL;

//Vergleich
vergleich 	:  (number | ID) VERGLEICHSSYMBOL (number | ID);

//schleife
schleife	: WHILESYMBOL vergleich DOSYMBOL programmcode ODSYMBOL;	

number 		: real | integer;

integer         : PLUSMINUSSYMBOL? UNSIGNEDINTEGERCONST;

real            : integer REALCUTSYMBOL UNSIGNEDINTEGERCONST?;

//print
println		: PRINTLNSYMBOL KLAMMERAUFSYMBOL zuweisungvalue* KLAMMERZUSYMBOL CMDENDSYMBOL; 

//READ
read		: READSYMBOL KLAMMERAUFSYMBOL ID KLAMMERZUSYMBOL CMDENDSYMBOL;
//Rechnen
arithausdr 	:	a;
a		:	e addition?;
addition	:	PLUSMINUSSYMBOL a;
e		:	p multiplikation?;
multiplikation 	:	MALGETEILTSYMBOL e;
p 		:	KLAMMERAUFSYMBOL a KLAMMERZUSYMBOL | arithidentifiere;
arithidentifiere :	number | ID;
// Quelle: http://wwwmayr.informatik.tu-muenchen.de/lehre/2007SS/theo/2007-06-01.pdf Seite 165
	
PROGRAMSYMBOL 	: 'program';
BEGINSYMBOL 	: 'begin';
ENDSYMBOL	: 'end';	
IFSYMBOL 	: 'if';
THENSYMBOL 	: 'then';
ELSESYMBOL 	: 'else';
FISYMBOL	: 'fi';
WHILESYMBOL 	: 'while';
DOSYMBOL	: 'do';
ODSYMBOL	: 'od';	
PRINTLNSYMBOL 	: 'print';
READSYMBOL	: 'read';

ZUWEISUNGSSYMBOL : ':=';			
VERGLEICHSSYMBOL : '<' | '<=' | '=' | '<>' | '>=' | '>';
KLAMMERAUFSYMBOL : '(';
KLAMMERZUSYMBOL : ')';	
CONSTANTSYMBOL 	: 'string' | 'integer' | 'real'| 'boolean';
PLUSMINUSSYMBOL : '+'| '-';	
MALGETEILTSYMBOL : '*'| '/';
LISTCUTSYMBOL 	: ',';
CMDENDSYMBOL 	: ';';
REALCUTSYMBOL   : '.'; 

UNSIGNEDINTEGERCONST 	: DIGIT+;		
BOOLEANCONST	: 'true' | 'false';
STRINGCONST	: '(\'' .*? '\')'; //? ersetzt options {greedy=false;}

ID  :	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;
 
fragment DIGIT 	:'0'..'9';


COMMENT	:	'/*' .*? '*/' {skip();} // made by antlr
    ;

WS  :   ( ' ' // made by antlr
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;