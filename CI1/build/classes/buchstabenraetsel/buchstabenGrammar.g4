grammar buchstabenGrammar;

start : line1 line2 line1 line3 line1;
line1 : ZIFFER PLUSMINUS ZIFFER ZUWEISUNG ZIFFER;
line2 : PLUSMINUS PLUSMINUS PLUSMINUS;
line3 : ZUWEISUNG ZUWEISUNG ZUWEISUNG;

//fragment:
ZIFFER : ('A'..'Z')+;
PLUSMINUS : '+' | '-';
ZUWEISUNG : '=';
IGNOREDSIGNES : ('\n' | '\r' | ' ') {skip();};
         
