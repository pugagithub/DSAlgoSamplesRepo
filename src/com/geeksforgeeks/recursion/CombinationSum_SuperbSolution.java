package com.geeksforgeeks.recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.util.MyUtil;

public class CombinationSum_SuperbSolution {

	/**
	 * 
	 * Since the problem is to get all the possible results, not the best or the
	 * number of result, thus we don’t need to consider DP(dynamic programming),
	 * recursion is needed to handle it.
	 * 
	 * combination always backtracking
	 */

	static int[] arr = { 2, 4, 6, 8 };
	static int target = 8;
	static List<List<Integer>> outerList = new ArrayList<List<Integer>>();
	static int setCount = 0;

	public static void main(String[] args) {
		combinationSum(0, 0, new ArrayList<Integer>());
		for (List<Integer> printList : outerList) {
			System.out.println(printList);
		}
	}

	static void combinationSum(int startIdx, int sum, List<Integer> list) {

		for (int i = startIdx; i < arr.length; i++) {
			boolean targetAchieved = false;
			sum = sum + arr[i];
			list.add(list.size(), arr[i]);
			
			if (sum == target) {
				outerList.add(new ArrayList(list)); // Adding new ArrayList(list) not directly list

			} else if (sum < target) {
				combinationSum(i, sum, list);

			}

			if (sum > target) {
				combinationSum(i + 1, sum, list);

			}

			sum = sum - arr[i];
			list.remove(list.size() - 1);

			// if(targetAchieved)i = i - 1; // one item can be picked up many time
		}

	}
}
