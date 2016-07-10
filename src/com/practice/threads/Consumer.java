package com.practice.threads;

public class Consumer implements Runnable {
	private Resource resource;
	public Consumer(Resource resource){
		this.resource=resource;
	}
 public void run(){
	 System.out.println("with in consumer");
	 for(String s=resource.consumption();s!="production end";s=resource.consumption()){
		 System.out.println("consuming"+s);
		 try{
		 Thread.sleep(1000);
		 }catch(InterruptedException e){
			 e.printStackTrace();
		 }
	 }
 }
}
