package com.practice.pojos;

import javax.naming.directory.InvalidAttributesException;

public class Parent {
	static String s="1";
public Parent(){
	System.out.println("parent construtor called"+ this.s);
	Parent();
}

public void Parent(){
	System.out.println("in method"+this.s);
}
protected int exceptiontest(int A, String b) throws InvalidAttributesException{
	return 10;
}
}
