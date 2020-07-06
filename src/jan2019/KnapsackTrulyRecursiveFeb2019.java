package jan2019;

import java.util.Queue;
import java.util.Stack;

public class KnapsackTrulyRecursiveFeb2019 {
	
	
	
	//Linear ==> Hence For loop and forward direction
	
	
	static int capacity = 39;
	static int[] items = { 11, 10, 7, 20, 5, 15, 35 };
	
	
	public static void main(String[] args) {
		
		
		Stack<Integer> stack = new Stack();
		boolean knapSackFound = rec( 0 , 0 , stack);
		
		System.out.println("knapSackFound :"+ knapSackFound);
		
		while(!stack.isEmpty()){
			
			System.out.println(stack.pop());
		}
	}
	
	
	static boolean rec(int startIdx , int sum , Stack<Integer> stack){
		
		for(int i= startIdx; i< items.length;i++  ){
			
			sum = sum + items[i];
			
			stack.push(items[i]);
			
			if(sum == capacity) return true;
			
			if(sum>capacity) {   
				stack.pop();
				sum = sum - items[i];
				continue;
			}
			
			if(rec(i+1,sum,stack)){
				return true;                      // Backtracking defintetly requires boolean return type. Only recursion dont
			}else{
				sum = sum - items[i];
				stack.pop();
			} 
			
			//Base Case : Going to next index until the index is less than the length 
		}
		
		return false;
		
	}
	
	
	

}


