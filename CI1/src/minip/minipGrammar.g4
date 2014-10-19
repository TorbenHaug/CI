grammar minipGrammar;

start: PROGRAMSYMBOL declarationlist BEGINSYMBOL programcode ENDSYMBOL;

declarationlist : declarationlist declaration | declaration;
declaration:  IDENTIFIER DECLEARESYMBOL identifierlist;
identifierlist: IDENTIFIER CMDENDSYMBOL | (IDENTIFIER TRENNSZEICHEN identifierlist);

programcode: ifanweisung;

ifanweisung: IFSYMBOL vergleich THENSYMBOL programcode ((ELSESYMBOL programcode FISYMBOL) | FISYMBOL);

vergleich: (IDENTIFIER | NUMBER) VERGLEICHSOPERATOR (IDENTIFIER | NUMBER);

PROGRAMSYMBOL : (P R O G R A M);
BEGINSYMBOL : B E G I N;
ENDSYMBOL : E N D;
IDENTIFIER : CAPITALLETTER (SMALLLETTER | CAPITALLETTER | DIGIT | UNDERSCORE)*;
CONSTANTS : (I N T E G E R) | (R E A L) | (S T R I N G) | (B O O L E A N);
TRENNSZEICHEN: ',';
CMDENDSYMBOL: ';';
DECLEARESYMBOL: ':=';
INTEGER: VORZEICHEN DIGIT+;
REAL: INTEGER '.' DIGIT+;
NUMBER: INTEGER | REAL;
IFSYMBOL: I F;
THENSYMBOL: T H E N;
ELSESYMBOL: E L S E;
FISYMBOL: F I;
VERGLEICHSOPERATOR: '<=' | '<' | '==' | '!=' | '>=' | '>';
NEWLINESYMBOL: '\n' | '\r';

// Fragments for helping Letter and Digit using
fragment SMALLLETTER : 'a'..'z';
fragment CAPITALLETTER : 'A'..'Z';
fragment DIGIT: '0'..'9';
fragment UNDERSCORE: '_';
fragment LETTER: SMALLLETTER | CAPITALLETTER;
fragment VORZEICHEN: '-' | '+'; 

// Fragments for ignoring casesensitivity in symbols
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');
