package com.practice.dataStrucures;

public class IntegerAlgos {
public void convertToBase(Integer number,int base){
	String result="";
	do{
		result=number % base+result;
		number = number/base;
	}while (number>=1);
	System.out.println(Integer.valueOf(result));
}
}
