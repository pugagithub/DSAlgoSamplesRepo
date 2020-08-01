package com.geeksforgeeks.dynamicProgramming.recursiveAndBacktrackingApproach;

import java.util.ArrayList;
import java.util.List;

public class WeightedJobScheduling_BacktrackingApproach {
	
/*
 * 
 * Job 1:  {1, 2, 50} 
       Job 2:  {3, 5, 20}
       Job 3:  {6, 19, 100}
       Job 4:  {2, 100, 200}
 */
	
	static List<Job> jobsList = new ArrayList<Job>();
	static int maxWeight = 0;
	

	public static void main(String[] args) {
		
		
		/*jobsList.add(new Job(1, 2, 50 ,"JOB1"));
		jobsList.add(new Job(3, 5, 20,"JOB2"));
		jobsList.add(new Job(6, 19, 100,"JOB3"));
		jobsList.add(new Job(2, 100, 200,"JOB4"));*/
		
		jobsList.add(new Job(3, 5, 25 ,"JOB1"));
		jobsList.add(new Job(1, 2, 50,"JOB2"));
		jobsList.add(new Job(6, 15, 75,"JOB3"));
		jobsList.add(new Job(2, 100, 100,"JOB4"));
		
		jobScheduling(new ArrayList<Job>() , 0 , 0);
		System.out.println("Max Wt : "+ maxWeight);
	}
	
	static void jobScheduling(List<Job> tempJobsList  , int startIdx , int weight){
		
		for(int i=startIdx; i<jobsList.size();i++) {
			
			tempJobsList.add(jobsList.get(i));
			weight = weight +  jobsList.get(i).weight;
			
			if(canItBeShceduled(tempJobsList ,  jobsList.get(i))) {
				
				
				
				jobScheduling(tempJobsList , i + 1 , weight);
				if(weight > maxWeight)maxWeight = weight;
				
				
				
			}
			tempJobsList.remove((jobsList.get(i)));
			weight = weight - jobsList.get(i).weight;
			
		}
		
	}
	
	static boolean canItBeShceduled(List<Job> tempJobsList , Job newJob){
		
		for(Job j : tempJobsList) {
			if(j.name.equalsIgnoreCase(newJob.name)) continue;
			 if ((newJob.start > j.start && newJob.start < j.end)  || (j.start > newJob.start && j.start < newJob.end)) {
				
				return false;
			}
		}
		return true;
	}
}


class Job {
	
	int start;
	int end;
	int weight;
	String name;
	
	public Job(int start, int end, int weight, String name) {
		super();
		this.start = start;
		this.end = end;
		this.weight = weight;
		this.name = name;
	}
	@Override
		public String toString() {
			return this.name;
		}
	
	
	
	
	
}