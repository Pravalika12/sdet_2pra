package com.VTiger.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistMethods {

	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("java");
		ar1.add("maths");
		ar1.add("python");
		ar1.add("automation");
		ar1.add("manual");
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("testing");
		ar2.add("developing");
		ar2.add("deveops");
		ar2.add("animate");
		ar2.add("designer");
		
		//System.out.println(ar2);
		//ar1.addAll(ar2);
		//System.out.println(ar1);
		//ar1.addAll(3, ar2);
		//System.out.println(ar1);
		//ar1.clear();
		//System.out.println(ar1);
		
		//ArrayList<String> clonelist=(ArrayList<String>)ar1.clone();
		//System.out.println(clonelist);
		//System.out.println(ar1.contains("java"));
		//System.out.println(ar1.indexOf("python")>0);
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("pra","dee","anu","pra","sru","anu"));
		System.out.println(list1);
		int i=list1.lastIndexOf("pra");
		System.out.println(i);
		list1.remove(1);
		System.out.println(list1);
		list1.remove("dee");
		System.out.println(list1);
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,4,5));
		numbers.removeIf(num -> num % 2 == 0);
		System.out.println(numbers);
	}
}
