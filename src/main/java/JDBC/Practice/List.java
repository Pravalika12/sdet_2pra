package JDBC.Practice;

import java.util.ArrayList;

public class List {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(1);
	al.add("java");
	al.add("sql");
	al.add(9);
	al.add("c");
	al.add(18);
	al.add(121);
	al.add("pravalika");
	System.out.println(al);
	al.add(3, "deepthi");
	System.out.println(al);
	al.remove(0);
	System.out.println(al);
	Object a=al.clone();
	System.out.println(a);
}
}
