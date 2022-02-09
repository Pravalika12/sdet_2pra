package com.VTiger.Practice;

public class Add_number_Alphanumeric {
public static void main(String[] args) {
	String s="56ad8du564u";
	int sum=0;
	String temp="";
	char[] ch=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		if(Character.isDigit(ch[i]))
		{
		temp=temp+ch[i];
		sum=sum+Integer.parseInt(temp);
		temp="";
	}
	}
	System.out.println(temp);
}
}
