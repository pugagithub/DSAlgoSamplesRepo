package com.simple;

public class BasicThread {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				for(int i=0;i<10;i++){
				System.out.println("User Created Thread : "+ Thread.currentThread().getName()+"--"+(i+1));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
				
			}
		}
			
		);
			
			t1.start();
		
		int i=0;
		while(i<10){
			System.out.println("Am inside thread :"+ Thread.currentThread().getName()+"--"+(i+1));
			Thread.sleep(1000);
			i++;
		}
		
		// TODO Auto-generated method stub

	}

}
