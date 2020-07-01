package com.banking;

class  MyThread extends  Thread{
	
	Account acct;
	String name;
	
	public MyThread(Account acct, String name) {
		this.acct=acct;
		setName(name);
		// TODO Auto-generated constructor stub
	}
	
	
	public void run() {
		super.run();
		try {
			acct.addFund(100);
			acct.dummy();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}