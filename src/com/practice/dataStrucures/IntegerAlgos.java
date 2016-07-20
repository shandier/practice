package com.practice.dataStrucures;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerAlgos {
public void convertToBase(Integer number,int base){
	String result="";
	do{
		result=number % base+result;
		number = number/base;
	}while (number>=1);
	System.out.println(Integer.valueOf(result));
}
public void closestNumber(){
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String line = sc.nextLine();
    String s[] = line.split(" ");
    int[] a = new int[s.length];
      for(int i=0;i<s.length;i++){
          a[i]=Integer.valueOf(s[i]);
      }
      Arrays.sort(a);
      String r="";
      int[] diff = new int[n-1];
      for(int i=0;i<n-1;i++){
          diff[i] = a[i+1]-a[i];
      }
      int min = Integer.MAX_VALUE;
      for(int i=0;i<n-1;i++){
          if(diff[i] < min)
              min = diff[i];
      }
      for(int i=0;i<n-1;i++){
          if(diff[i] == min)
              r+=a[i]+" "+a[i+1]+" ";
      }
      System.out.println(r);
  }
}
