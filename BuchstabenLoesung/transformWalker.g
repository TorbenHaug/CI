tree grammar transformWalker;

options {
  output=AST;
  tokenVocab=buchstabenGrammar; // import tokens from CMinus.g
  ASTLabelType=CommonTree;
}

prog	:	^(RAETSEL aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe);

aufgabe	:	^(EQUALS (^(PLUS wort wort)) wort)
	|	^(EQUALS ^(MINUS w1=wort w2=wort) w3=wort) -> ^(EQUALS ^(PLUS[null, "+"] $w3 $w2) $w1)
;

wort 	:	^(WORT LETTER+);