package com.practice.threads;

public class Resource {

	private String value;
	private boolean consumed = true;

	public synchronized String consumption() {
		while (consumed) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		consumed = true;
		notifyAll();
		return this.value;
	}

	public synchronized void production(String value) {
		while (!consumed) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.value = value;
		consumed = false;
		notifyAll();
	}
}
