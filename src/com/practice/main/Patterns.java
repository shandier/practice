package com.practice.main;

public class Patterns {
public void draw(){
	int count = 1;
	for(int i=9;i>0;i--){
		for(int j=1;j<=i;j++){
			System.out.print(" ");
		}
		for(int j=1;j<=count;j++){
			System.out.print(j+" ");
		}
		System.out.println();
		count+=2;
	}
}
}
