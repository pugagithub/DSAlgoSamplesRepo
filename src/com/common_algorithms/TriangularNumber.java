package com.common_algorithms;

public class TriangularNumber {

	public static void main(String[] args) {

		int i=5;
		
		System.out.println("Am calling triangular("+i+")");
		System.out.println("Triangular Number is  --> "+  triangular(i) );
		
	}
	static int sum = 0;
	static int triangular(int n){
		
		System.out.println("AM called with argument"+ n);
		if(n==1){
			System.out.println("BASE CONDITION REACHED");
			return 1;
		}
		
		System.out.println("Am calling triangular("+(n-1)+")");
		sum = sum + triangular(n-1);
		System.out.println("n is "+ n +"--> Return Value is---> "+ sum);
		return sum;
		
	}
	
}
