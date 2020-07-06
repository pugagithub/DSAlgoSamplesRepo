package jan2019;

import java.util.Stack;

public class KnapSackRecursive1 {

	
	// static int capacity = 20; 
	// static int[] items ={11,8,7,6,5};
	 

	static int capacity = 52;
	static int[] items = { 11, 10, 7, 20, 5, 15, 35 };

	public static void main(String[] args) {

		for (int i = 0; i < items.length; i++) {
			Stack stack = new Stack();
			if (knapsack(i, 0, stack)) {
				System.out.print("Knapsak found : ");
				while (!stack.isEmpty()) {
					System.out.print(stack.pop() + ",");
				}
				break;
			}

			System.out.println(
					"==========================================================================================");

		}
		
		System.out.println("Knapsack not found");
	}

	static public boolean knapsack(int i, int sum, Stack stack) {
		
		if(i<items.length)System.out.println("Called knapsack method with index  : "+ i +" and val : "+ items[i]);

		if (i >= items.length) {
			System.out.println("Index : " + i + ". Am Returning");
			return false;
		} else {

		}

		
		sum = sum + items[i];
		//System.out.println("Added "+items[i]+" to sum : "+ sum );

		if (sum == capacity) {
			System.out.println(" %%%index : " + i + ": content : " + items[i] + " : sum : " + sum);
			stack.push(items[i]);
			return true;
		}

		System.out.println("$$$ : index : " + i + ": content : " + items[i] + " : sum : " + sum);

		if (sum > capacity) {
			sum = sum - items[i];
			System.out.println("1 : Removing " + items[i] + " : sum : " + sum);

			for (int k = (i + 1); k < items.length; k++) {
				sum = sum + items[k];
				stack.push(items[k]);
				System.out.println("^^^ : index : " + k + ": content : " + items[k] + " : sum : " + sum);
				
				if (sum == capacity) {
					
					return true;
				}

				if (sum > capacity) {
					sum = sum - items[k];
					stack.pop();
					System.out.println(" 2 : Removing " + items[k] + " : sum : " + sum);
				}
			}

		} else {

			sum = sum - items[i]; 
			System.out.println("Removed "+items[i]+" from sum and current sum is  : "+ sum );
			System.out.println("current sum : "+ sum);
			
			while (i < items.length) {
				System.out.println("Going into while loop . CURRENT I : SEE THE BACKTRACKING FOR I : "+ i);
				System.out.println("Pushing in stack : "+ items[i]);
				stack.push(items[i]);
				sum = sum + items[i];
				System.out.println("current sum after adding :"+items[i]+" : "+ sum);
				if (knapsack(++i, sum, stack)) {
					return true;
				}
				System.out.println("Popping from stack : "+ items[i-1] + " . INDEX AFTER RECURSIVE FUNCTION WILL ALWAYS START FROM CURRENT FN index : i: "+ i);
				int val =Integer.parseInt(stack.pop()+"");
				sum = sum - val;
				System.out.println("current sum : "+ sum);
			}

			

		}

		return false;

	}

}
