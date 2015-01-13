grammar buchstabenGrammar;

options {
	output=AST;
	ASTLabelType=CommonTree;
}

tokens {
	WORT;
	AUFGABE;
	RAETSEL;
}

start 	:	z11=zahl op11=operator z12=zahl EQUALS z13=zahl NEWLINE 
		opl1=operator opl2=operator opl3=operator NEWLINE
		z21=zahl op21=operator z22=zahl EQUALS z23=zahl NEWLINE
		eqline
		z31=zahl op31=operator z32=zahl EQUALS z33=zahl NEWLINE?
		//-> (AUFGABE AUFGABE);   
		-> ^(RAETSEL ^(EQUALS["="] ^($op11 $z11 $z12) $z13) 
		^(EQUALS["="] ^($op21 $z21 $z22) $z23) 
		^(EQUALS["="] ^($op31 $z31 $z32) $z33) 
		^(EQUALS["="] ^($opl1 $z11 $z21) $z31) 
		^(EQUALS["="] ^($opl2 $z12 $z22) $z32) 
		^(EQUALS["="] ^($opl3 $z13 $z23) $z33)) ; 

eqline 	:	EQUALS EQUALS EQUALS NEWLINE;

operator:	(PLUS|MINUS);

zahl 	:	 LETTER+
->	^(WORT LETTER+);

WS  :   ( ' '
        | '\t'
        ){skip();}
    ;

PLUS	:	'+';
MINUS 	:	 '-';

EQUALS 	:	 '=';

NEWLINE	:	'\r'? '\n';

LETTER 	: 'A'..'Z';