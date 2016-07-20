package com.practice.dataStrucures;

import java.util.HashMap;
import java.util.Map;

public class StringAlgos {

	public boolean isUniqueChar(String str) {
		char[] charArray = str.toCharArray();
		for (int i=0;i<charArray.length;i++) {
			int  j=charArray.length-1;
			while(j!=i){
				if(charArray[i]==(charArray[j]))
					return false;
				j--;
			}
		}
		return true;
	}
	
	public String reverse(String str){
		char[] a=str.toCharArray(),b=new char[a.length];
		for(int j=0,i=a.length-1;i>=0;i--){
			b[j]=a[i];j++;
		}
		return new String(b);
	}
	
	public String removeDublicate(String str){
		char[] a=str.toCharArray();
		int tail =1;
		for (int i=1;i<a.length;++i) {
			int j;
			for(j=0;j<tail;++j){
				if (a[i] == a[j]) break;
			}
			if (j == tail) {
				 a[tail] = a[i];
				 ++tail;
				 }
			 }
			a[tail] = 0;
			return new String(a);
	}
	public String repetedChars(String s){
		Map<Character,Integer> count = new HashMap<Character,Integer>();
		for(char c:s.toCharArray()){
			if(count.containsKey(c)){
				count.put(c,count.get(c)+1);
			}else{
				count.put(c,1);
			}
		}
		return count.toString();
	}
}
