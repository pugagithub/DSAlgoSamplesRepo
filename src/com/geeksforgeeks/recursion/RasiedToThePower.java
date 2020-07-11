package com.Recursion;

public class RasiedToThePower {
	
	public static void main(String[] args) {
		
		int init_val = 1;
		System.out.println(pow(init_val,2,4));
		
	}

	private static int pow(int val , int base, int power) {
		
		if(power==0)return val;
		val = val * base;
		power = power-1;
		return  pow(val,base,power);
		
	}

}
