package com.geeksforgeeks.dynamicProgramming.tabulationApproach;

import java.util.ArrayList;
import java.util.List;

public class JobScheduling_DP_TabulationApproach {
	
/*
 * 
 * Job 1:  {1, 2, 50} 
       Job 2:  {3, 5, 20}
       Job 3:  {6, 19, 100}
       Job 4:  {2, 100, 200}
 */
	
	static List<Job> jobsList = new ArrayList<Job>();
	
	

	public static void main(String[] args) {
		
		
		jobsList.add(new Job(1, 2, 50));
		jobsList.add(new Job(3, 5, 20));
		jobsList.add(new Job(6, 19, 100));
		jobsList.add(new Job(2, 100, 200));
		
		jobScheduling(jobsList , 0 , 0);
	}
	
	static void jobScheduling(List<Job> tempJobsList  , int startIdx , int weight){
		
		for(int i=startIdx; i<jobsList.size();i++) {
			
			if(canItBeShceduled(tempJobsList ,  jobsList.get(i))) {
				
				
				
			}
		}
	}
	
	static boolean canItBeShceduled(List<Job> tempJobsList , Job newJob){
		
		for(Job j : tempJobsList) {
			
			if(newJob.start >= j.start && newJob.end <= j.end ) {
				
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
	
	public Job(int start, int end, int weight) {
		super();
		this.start = start;
		this.end = end;
		this.weight = weight;
	}
	
	
	
	
	
}