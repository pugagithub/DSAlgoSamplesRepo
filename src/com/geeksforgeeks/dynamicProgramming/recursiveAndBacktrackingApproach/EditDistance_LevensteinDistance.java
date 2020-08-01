package com.geeksforgeeks.dynamicProgramming.recursiveAndBacktrackingApproach;

import java.util.Arrays;
import java.util.Collections;

public class EditDistance_LevensteinDistance {

	static String word = /* "intention" */ /* "intention" */ "horse";
	static String targetStr = /* "execution" */ /* "execution" */ "ros";

	public static void main(String[] args) {
		System.out.println("Count : " + editDistance(word, 0, 0, "Main Fn"));
		;
	}

	// We can use merge also
	static int editDistance(String orginalStr, int count, int startIdx, String calledBy) {

		int i = startIdx;
		if (orginalStr.equals(targetStr))return count;
		// Any one of the string's length has been exceeded by index
		if (startIdx >= orginalStr.length() || startIdx >= targetStr.length()) {
			if (startIdx >= targetStr.length()) count = count + orginalStr.length() - startIdx;
			else if (startIdx >= orginalStr.length()) count = count + targetStr.length() - startIdx;
			return count;
		}

		
		String replacedString = "", addedString = "", removedString = "";
		// If both characters are equal , dont do any
		if ((orginalStr.charAt(i) + "").equals(targetStr.charAt(i) + "")) return editDistance(orginalStr, count, i + 1, "BOTH EQUAL");
		else {

			replacedString = replace(orginalStr, i);
			addedString = add(orginalStr, i);
			removedString = remove(orginalStr, i);
			count = count + 1;

			return min(
					editDistance(replacedString, count, i + 1, "REPLACE"),
					editDistance(addedString, count, i + 1, "ADD"), 
					editDistance(removedString, count, i, "REMOVE")
			);

		}

		

	}

	static String add(String orginalStr, int i) {
		return orginalStr.substring(0, i) + targetStr.charAt(i) + orginalStr.substring(i); // Add
	}

	static String replace(String orginalStr, int i) {
		return orginalStr.substring(0, i) + targetStr.charAt(i) + orginalStr.substring(i + 1);
	}

	static String remove(String orginalStr, int i) {
		return orginalStr.substring(0, i) + orginalStr.substring(i + 1);
	}

	
	static int min(Integer... a) {
		return Collections.min(Arrays.asList(a));
	}

}
