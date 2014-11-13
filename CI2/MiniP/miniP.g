grammar miniP;


options {
	ASTLabelType=CommonTree;
	output=AST;
	}
tokens{
	START;
	DECLARATION;
	PROGRAMMCODE;
}
start:
         PROGRAMSYMBOL 
            declaration
         BEGINSYMBOL 
            programmcode
         ENDSYMBOL -> ^(START declaration programmcode);
//Declaration einer Variablen
declaration	: declarations* -> ^(DECLARATION declarations*);
declarations 	: (CONSTANTSYMBOL ID (LISTCUTSYMBOL ID)* CMDENDSYMBOL) -> ^(CONSTANTSYMBOL ID*);

//Programmcode
programmcode 	: anweisung* -> ^(PROGRAMMCODE anweisung*);
anweisung 	: zuweisung | condition | schleife | println | read;


// Zuwweisung
zuweisung 	: ID ZUWEISUNGSSYMBOL^ zuweisungswert CMDENDSYMBOL!;
zuweisungswert 	: STRINGCONST | BOOLEANCONST | vergleich | arithausdr; // INTEGERCONST | REALCONST |  entfernt, da es durch den arithausdr ersetzt wird. 

//Conditon
condition 	: IFSYMBOL^ vergleich THENSYMBOL! programmcode (ELSESYMBOL! programmcode)? FISYMBOL!;

//Vergleich
vergleich 	:  (number | ID) VERGLEICHSSYMBOL^ (number | ID);

//schleife
schleife	: WHILESYMBOL^ vergleich DOSYMBOL! programmcode ODSYMBOL!;	

number 		: REALCONST | INTEGERCONST;

//print
println		: PRINTLNSYMBOL^ KLAMMERAUFSYMBOL! zuweisungswert KLAMMERZUSYMBOL! CMDENDSYMBOL!; 

//READ
read		: READSYMBOL^ KLAMMERAUFSYMBOL! ID KLAMMERZUSYMBOL! CMDENDSYMBOL!;
//Rechnen
arithausdr      : product (PLUSMINUSSYMBOL^ product)*;
product         : term (MALGETEILTSYMBOL^ term)*;
term            : ID | number | KLAMMERAUFSYMBOL! arithausdr KLAMMERZUSYMBOL!;
	
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
PRINTLNSYMBOL 	: 'println';
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


fragment UNSIGNEDINTEGERCONST 	: DIGIT+;		
BOOLEANCONST	: 'true' | 'false';
INTEGERCONST         : PLUSMINUSSYMBOL? UNSIGNEDINTEGERCONST;

REALCONST            : INTEGERCONST REALCUTSYMBOL UNSIGNEDINTEGERCONST?;

//Antlr3
STRINGCONST	: '(\'' (options {greedy=false;} : .)* '\')'; 
//Antlr4
//STRINGCONST	: '(\'' .*? '\')'; //? ersetzt options {greedy=false;} : 

ID  :	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;
 
fragment DIGIT 	:'0'..'9';

//Antlr3
COMMENT	:	'/*' (options {greedy=false;} : .)* '*/' {skip();} ;
//Antlr4
//COMMENT	:	'/*' .*? '*/' {skip();} ;

WS  :   ( ' ' // made by antlr
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;

