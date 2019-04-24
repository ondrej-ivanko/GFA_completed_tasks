package dominoes;

import java.text.CollationElementIterator;
import java.util.*;

public class Dominoes {
	public static void main(String[] args) {
		List<Domino> dominoes = initializeDominoes();
		// You have the list of Dominoes
		// Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
		// eg: [2, 4], [4, 3], [3, 5] ...
		for (int i = 0; i < dominoes.size() - 2; i++) {
			while (dominoes.get(i).getRightSide() != dominoes.get(i + 1).getLeftSide()) {
				Domino temp = dominoes.get(i + 1);
				dominoes.remove(i + 1);
				dominoes.add(temp);
			}
		}
		Collections.sort(dominoes);
		System.out.println(dominoes);
		for (Domino domino : dominoes) {
			domino.printAllFields();
		}
	}

	static List<Domino> initializeDominoes() {
		List<Domino> dominoes = new ArrayList<>();
		dominoes.add(new Domino(5, 2));
		dominoes.add(new Domino(4, 6));
		dominoes.add(new Domino(1, 5));
		dominoes.add(new Domino(6, 7));
		dominoes.add(new Domino(2, 4));
		dominoes.add(new Domino(7, 1));
		return dominoes;
	}

}
