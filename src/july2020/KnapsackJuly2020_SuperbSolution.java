package july2020;

import java.util.ArrayList;
import java.util.List;

public class KnapsackJuly2020_SuperbSolution {
	
	static int capacity = 51;
	static int[] items = { 11, 10, 7, 20, 5, 15, 35 };
	
	// static int capacity = 10;
	// static int[] items ={11,8,7,6,5};
	
	static List<Integer> knapsack( List<Integer> bag , int startIdx ,  int sum) {
		
		
		for(int i=startIdx;i<items.length;i++) {
			
			sum = sum + items[i];
			bag.add(items[i]);
			if(sum == capacity) return bag;
			else if(sum < capacity) {
				
				if(knapsack( bag , i+1 , sum)!=null)return bag; //not i++
			}	
			
			sum = sum - items[i];
			bag.remove(bag.size()-1);
			
			
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		List<Integer> inputList = new ArrayList<Integer>();
		List<Integer> list = knapsack(inputList , 0, 0);
		if(list == null) System.out.println("Capacity Not Found");
		else for(Integer val : list) System.out.println(val);
		
	}

}
