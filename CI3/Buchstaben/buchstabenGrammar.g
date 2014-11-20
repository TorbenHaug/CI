grammar buchstabenGrammar;

options{
	ASTLabelType=CommonTree;
	output=AST;}
tokens{
	SYMBOLPUZZLE;
	INPUT_STRING;}

@members {
	// Generiert einen Teil des Baumes
	private CommonTree getSubtree(String op, Tree left, Tree middle, Tree right) {
		CommonTree result = (CommonTree) adaptor.create(EQUAL_SIGN, "=");
		
		if (op.equals("+")) {
			CommonTree term = (CommonTree) adaptor.create(PLUS_MINUS_SIGN, "+");
			adaptor.addChild(term, left);
			adaptor.addChild(term, middle);
			
			adaptor.addChild(result, term);
			adaptor.addChild(result, right);
		} else {
			CommonTree term = (CommonTree) adaptor.create(PLUS_MINUS_SIGN, "+");
			adaptor.addChild(term, right);
			adaptor.addChild(term, middle);
			
			adaptor.addChild(result, term);
			adaptor.addChild(result, left);
		}
		
		return result;
	}
}



start : el1 = expression_line
	ol = operation_line
	el2 = expression_line
	equality_line
	el3 = expression_line {
	CommonTree result = (CommonTree) adaptor.create(SYMBOLPUZZLE, "SYMBOLPUZZLE");
	
	CommonTree vertical_top = getSubtree(el1.op, el1.left, el1.middle, el1.right);
	CommonTree vertical_middle = getSubtree(el2.op, el2.left, el2.middle, el2.right);
	CommonTree vertical_bottom = getSubtree(el3.op, el3.left, el3.middle, el3.right);
	CommonTree horizontal_left = getSubtree(ol.left, el1.left, el2.left, el3.left);
	CommonTree horizontal_middle = getSubtree(ol.middle, el1.middle, el2.middle, el3.middle);
	CommonTree horizontal_right = getSubtree(ol.right, el1.right, el2.right, el3.right);
	
	adaptor.addChild(result, vertical_top);
	adaptor.addChild(result, vertical_middle);
	adaptor.addChild(result, vertical_bottom);
	adaptor.addChild(result, horizontal_left);
	adaptor.addChild(result, horizontal_middle);
	adaptor.addChild(result, horizontal_right);
} -> {result};


expression_line returns[String op, Tree left, Tree middle, Tree right]:
	t=term EQUAL_SIGN r=char_string {
		$op = $t.op;
		$left = $t.left;
		$middle = $t.middle;
		$right = $r.tree;
	};
	
term	returns[Tree left,String op, Tree middle]:
	l=char_string o=PLUS_MINUS_SIGN m=char_string {
		$left = $l.tree;
		$op = $o.text;
		$middle = $m.tree;
	};
	
operation_line returns[String left, String middle, String right]:
	l=PLUS_MINUS_SIGN m=PLUS_MINUS_SIGN r=PLUS_MINUS_SIGN {
		$left = $l.text;
		$middle = $m.text;
		$right = $r.text;
	};

equality_line : EQUAL_SIGN EQUAL_SIGN EQUAL_SIGN;

char_string : CHAR+ -> ^(INPUT_STRING CHAR+);

/*
start : expression_line operation_line expression_line equality_line expression_line -> ^(SYMBOLPUZZLE expression_line*);
expression_line :  term EQUAL_SIGN char_string -> ^(EQUAL_SIGN term char_string);
term	:	char_string PLUS_MINUS_SIGN^ char_string;
operation_line : PLUS_MINUS_SIGN PLUS_MINUS_SIGN PLUS_MINUS_SIGN;
equality_line : EQUAL_SIGN EQUAL_SIGN EQUAL_SIGN;

char_string : CHAR+ -> ^(INPUT_STRING CHAR+);
*/

CHAR : ('A'..'Z'); 
PLUS_MINUS_SIGN : '+' | '-';
EQUAL_SIGN : '=';
IGNOREDSIGNES : ('\n' | '\r' | ' ') {skip();};
