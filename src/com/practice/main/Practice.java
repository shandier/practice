package com.practice.main;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.practice.dataStrucures.LinkedListImpl;
public class Practice {
public static void main(String[] args)throws Exception {
	
		//codtest();
		//largestNumber();
		//recursiontest();
		// linkListtest();
	   	//duplicateNumber();
	threadTest();
}
private static void threadTest() throws InterruptedException{
	Runnable r =  new Runnable() {
		public void run() {
			for(int i=0;i<=5;i++){
				Thread t = Thread.currentThread();
				System.out.println(t.getName()+i);
				try {
					t.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};

	Thread t1 = new Thread(r,"abc");
	Thread t2 = new Thread(r,"xyz");
	//Thread.currentThread().join();//deadLock
	t1.start();
	t2.start();
	t1.sleep(1000);
	t2.interrupt();
}
private static void duplicateNumber() {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.nextLine();
	Set<Integer> intSet = new HashSet<Integer>();
	Set<Integer> dupSet = new HashSet<Integer>();
	while(n-->0){
		int num = sc.nextInt();
	if(!intSet.add(num)){
		dupSet.add(num);
	}
	sc.nextLine();
	}
	System.out.println(dupSet);
}
private static void linkListtest() {
	LinkedListImpl<Integer> linkedList = new LinkedListImpl<>();
	linkedList.add(3);
	linkedList.add(4);
	linkedList.add(18);
	linkedList.traverse();
	linkedList.reverse();
}
private static void recursiontest() {
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	int total =0;
	total =sum(number);
	System.out.println(total);
}
private static int sum(int number) {
	if(number==0){
		return 0;
	}else{
		return number%10+sum(number/10);
		//return total+=sum(number/10,total);
	}
}
private static void largestNumber() {
	Scanner sc = new Scanner(System.in);
	System.out.println("plese enter number of input lines");
	int arraySize = sc.nextInt();
	sc.nextLine();
	List<Integer> list = new ArrayList<Integer>();
	int max=0;
	while(arraySize>0){
		arraySize--;
		String digit = sc.nextLine();
		for(int i=0;i<digit.length();i++){
			int v = Character.getNumericValue((digit.charAt(i)));
			if(max<v)
				max=v;
			list.add(v);
			}
		}
	int[] arrInt = new int[list.size()];
	
	for(int i=0;i<list.size();i++){
		int num=list.get(i);
		arrInt[num]++;
			
	}
	Collections.sort(list);
	Collections.reverse(list);
	System.out.println(arrInt.toString());
	}
private static void getFingerPrintList(String xml) throws Exception{
	List<String> fingerPrint = new ArrayList();
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();
			InputSource src = new InputSource();
			src.setCharacterStream(new StringReader(xml));
			Document doc = builder.parse(src);
			String eid = doc.getElementsByTagName("Eid")
					.item(0).getTextContent();
			NodeList FingerPrintsNodeList = doc
					.getElementsByTagName("Fingerprint");
			if (FingerPrintsNodeList.getLength() > 0) {
				for (int i = 0; i < FingerPrintsNodeList.getLength(); i++) {
					fingerPrint.add(eid);
					NodeList fingerPrintChildNodes = FingerPrintsNodeList.item(
							i).getChildNodes();
					for (int j = 0; j < fingerPrintChildNodes.getLength(); j++) {
						Node c = fingerPrintChildNodes.item(j);
						if (c.getNodeName().equalsIgnoreCase(
								"FingerprintId")) {
							fingerPrint.add(c.getTextContent());
						}
						if (c.getNodeName().equalsIgnoreCase(
								"FingerprintFriendlyName")) {
							fingerPrint.add(c.getTextContent());
						}
						if (c.getNodeName().equalsIgnoreCase(
								"FingerprintValue")) {
							fingerPrint.add(c
									.getTextContent());
						}
					}
				}
			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			throw new Exception(e.getMessage());
		}
		System.out.println(fingerPrint);
}

	public static void codtest() throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		List<char[]> inputList = new ArrayList<char[]>();
		while (testCase != 0) {
			testCase--;
			int testLines = sc.nextInt();
			sc.nextLine();
			while (testLines != 0) {
				testLines--;
				String s = sc.nextLine();
					inputList.add(s.toLowerCase().toCharArray());
			}
		}
		System.out.println(inputList);
		List<String> outPut = new ArrayList<String>();
		int sum=0;
		int k= 0;
		int j=0;
		int carry = 0;
		while(k<inputList.get(0).length){
			while(j<inputList.size()){
				Character c = inputList.get(j)[k];
				if(Character.isDigit(c)){
				sum+= c.getNumericValue(c);
				}else{
				sum+= c;
				}
				j++;
			}
			sum+=carry;
			if(sum>(int)('z')){
				carry=sum-(int)('z');
				sum=0;
			}
			j=0;
			k++;
			Character fc = (char) ((char) sum-0);
			outPut.add(fc.toString());
			sum=0;
		}
		System.out.println(outPut);
	}
}

