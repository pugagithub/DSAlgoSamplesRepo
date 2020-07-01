package com.stack;

public class StackMainClass {

	public static void main(String[] args) {

		Stack stack = new Stack();

		// =============Stack Push===============
		stack.push("10");
		stack.push("20");
		stack.push("30");
		stack.push("40");
		stack.display();
		// ============================================

		// =============Stack Pop===============
		System.out.println("\nPop : " + stack.pop());
		stack.display();
		System.out.println("\nPop : " + stack.pop());
		stack.display();
		System.out.println("\nPop : " + stack.pop());
		stack.display();
		System.out.println("\nPop : " + stack.pop());
		stack.display();
		// ===========================================
		
		//================Parenthesis Checker===================
		System.out.println(parenthesisChecker("((()))"));
		System.out.println(parenthesisChecker("[{()}]"));
		System.out.println(parenthesisChecker("[[[]]]"));
		System.out.println(parenthesisChecker("[[[ Hello Pugal ]]]"));
		System.out.println(parenthesisChecker("{{)"));
		//========================================================
	}

	static boolean parenthesisChecker(String str) {
		// ((()))
		Stack stack = new Stack();
		for (int i = 0; i < str.length(); i++) {
			String bracket = str.charAt(i) + "";
			if (isOpenBracket(bracket)) {
				stack.push(bracket + "");
			} else if (isClosedBracket(bracket)) {
				String fromStack = stack.peek();
				if (bracket.equalsIgnoreCase("}") && fromStack.equalsIgnoreCase("{")
						|| bracket.equalsIgnoreCase("]") && fromStack.equalsIgnoreCase("[")
						|| bracket.equalsIgnoreCase(")") && fromStack.equalsIgnoreCase("(")) {
					stack.pop();

				}
			}
		}
		
		if(stack.isEmpty()) return true;
		else return false;
	}

	static boolean isOpenBracket(String s) {
		if (s.equalsIgnoreCase("{") || s.equalsIgnoreCase("(") || s.equalsIgnoreCase("["))
			return true;
		else
			return false;
	}

	static boolean isClosedBracket(String s) {
		if (s.equalsIgnoreCase("}") || s.equalsIgnoreCase(")") || s.equalsIgnoreCase("]"))
			return true;
		else
			return false;
	}
}
