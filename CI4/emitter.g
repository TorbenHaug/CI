tree grammar emitter;
options {
language = Java;
output = template;
tokenVocab = buchstabenGrammar;
ASTLabelType = CommonTree;
}
@header {
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.lang.Character;
}

prog returns [Set<String> letters, Set<String> constraints]
	:	^(RAETSEL a1=aufgabe a2=aufgabe a3=aufgabe a4=aufgabe a5=aufgabe a6=aufgabe) 
	{
	$letters = new HashSet<String>();
	$constraints = new HashSet<String>();
	
	$letters.addAll($a1.signs);
	$letters.addAll($a2.signs);
	$letters.addAll($a3.signs);
	$letters.addAll($a4.signs);
	$letters.addAll($a5.signs);
	$letters.addAll($a6.signs);
	
	$constraints.add($a1.st.toString());
	$constraints.add($a2.st.toString());
	$constraints.add($a3.st.toString());
	$constraints.add($a4.st.toString());
	$constraints.add($a5.st.toString());
	$constraints.add($a6.st.toString());
	}
	-> sums(constrains={$constraints},letters={$letters});

aufgabe	returns[Set<String> signs]
	@after {
		$signs = new HashSet<String>();
		$signs.addAll(w1.number.getCharacters());
		$signs.addAll(w2.number.getCharacters());
		$signs.addAll(w3.number.getCharacters());
	}
	:	^(EQUALS (^(PLUS w1=wort w2=wort)) w3=wort)
	-> sum(sum1={w1.number}, sum2={w2.number}, erg={w3.number});

wort 	returns[Number number]
	@after{
		$number = new Number();
		$number.setDigits($letters);
	}
	:	^(WORT letters+=LETTER+);