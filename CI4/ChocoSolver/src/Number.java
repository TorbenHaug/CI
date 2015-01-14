import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.antlr.runtime.tree.Tree;

public class Number {
	List<String> digits = new ArrayList<>();
	int maxSize;

	public void setDigits(List<Tree> tokens) {
            for (Tree tree : tokens) {
                digits.add(tree.getText());
            }
	}
	
	public List<String> getCharacters() {
		return digits;
	}

	public int getSize() {
		return digits.size();
	}
}
