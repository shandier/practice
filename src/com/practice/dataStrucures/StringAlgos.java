package com.practice.dataStrucures;

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
}
