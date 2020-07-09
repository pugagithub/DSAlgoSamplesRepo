package com.geeksforgeeks.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*class Node1 {
    Node1<T> leftChild, rightChild;
    T data;

    public Node1(T data) {
        this.data = data;
    }
}*/

class BTreePrinter {

	public static  void printNode(Node root) {
		int maxLevel = BTreePrinter.maxLevel(root);

		printNodeInternal(Collections.singletonList(root), 1, maxLevel);
	}

	private static  void printNodeInternal(List<Node> Node1s, int level, int maxLevel) {
		if (Node1s.isEmpty() || BTreePrinter.isAllElementsNull(Node1s))
			return;

		int floor = maxLevel - level;
		int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
		int firstSpaces = (int) Math.pow(2, (floor)) - 1;
		int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

		BTreePrinter.printWhitespaces(firstSpaces);

		List<Node> newNode1s = new ArrayList<Node>();
		for (Node Node1 : Node1s) {
			if (Node1 != null) {
				System.out.print(Node1.data);
				newNode1s.add(Node1.leftChild);
				newNode1s.add(Node1.rightChild);
			} else {
				newNode1s.add(null);
				newNode1s.add(null);
				System.out.print(" ");
			}

			BTreePrinter.printWhitespaces(betweenSpaces);
		}
		System.out.println("");

		for (int i = 1; i <= endgeLines; i++) {
			for (int j = 0; j < Node1s.size(); j++) {
				BTreePrinter.printWhitespaces(firstSpaces - i);
				if (Node1s.get(j) == null) {
					BTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
					continue;
				}

				if (Node1s.get(j).leftChild != null)
					System.out.print("/");
				else
					BTreePrinter.printWhitespaces(1);

				BTreePrinter.printWhitespaces(i + i - 1);

				if (Node1s.get(j).rightChild != null)
					System.out.print("\\");
				else
					BTreePrinter.printWhitespaces(1);

				BTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
			}

			System.out.println("");
		}

		printNodeInternal(newNode1s, level + 1, maxLevel);
	}

	private static void printWhitespaces(int count) {
		for (int i = 0; i < count; i++)
			System.out.print(" ");
	}

	private static <T> int maxLevel(Node Node1) {
		if (Node1 == null)
			return 0;

		return Math.max(BTreePrinter.maxLevel(Node1.leftChild), BTreePrinter.maxLevel(Node1.rightChild)) + 1;
	}

	private static <T> boolean isAllElementsNull(List<T> list) {
		for (Object object : list) {
			if (object != null)
				return false;
		}

		return true;
	}

}