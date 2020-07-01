package com.banking;

public class Account {
	
	int acctNum=1234;
	volatile int bal=500;
	
	public synchronized void addFund(int fund) throws InterruptedException{
		System.out.println("Thread " + Thread.currentThread().getName() + " is executing");
		bal = bal + fund;
		System.out.println("Thread " + Thread.currentThread().getName() + " is going to sleep");
		//Thread.sleep(1000);
		wait(100);
		System.out.println("Thread " + Thread.currentThread().getName() + " is awaken from sleep");
		System.out.println("Final bal "+bal +" Thread Name :"+ Thread.currentThread().getName());
	}

	public void dummy(){
		
		System.out.println("Am in dummy -->"+ Thread.currentThread().getName()  );
	}
	
	public static void main(String[] args) {

		Account acct = new Account();
		new MyThread(acct,"t1").start();
		new MyThread(acct ,"t2").start();
		new MyThread(acct,"t3").start();
		new MyThread(acct ,"t4").start();
		new MyThread(acct,"t5").start();
		new MyThread(acct ,"t6").start();
		
System.out.println("Done");
	}
	
	
	 

}
