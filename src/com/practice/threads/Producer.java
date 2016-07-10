package com.practice.threads;

public class Producer implements Runnable {

	private Resource resource;

	public Producer(Resource resource) {
		this.resource = resource;
	}
	public void run(){
		System.out.println("within producer");
		for(int i=0;i<5;i++){
			System.out.println("producing message"+i);
		resource.production("message"+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		resource.production("production end");
	}
	
}
