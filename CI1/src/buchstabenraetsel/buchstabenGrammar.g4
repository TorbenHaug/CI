grammar buchstabenGrammar;

start : line1 line2 line1 line3 line1;
line1 : ZIFFER PLUSMINUS ZIFFER ZUWEISUNG ZIFFER NEWLINE;
line2 : PLUSMINUS PLUSMINUS PLUSMINUS NEWLINE;
line3 : ZUWEISUNG ZUWEISUNG ZUWEISUNG NEWLINE;

//fragment:
ZIFFER : ('A'..'Z')+;
PLUSMINUS : '+' | '-';
ZUWEISUNG : '=';
NEWLINE : '\n';
         
