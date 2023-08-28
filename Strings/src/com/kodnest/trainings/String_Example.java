package com.kodnest.trainings;

public class String_Example {
	public static void main(String[] args) {
		
	
	String s1="Rama";
	String s2="Rama";
	String s5=s1+s2;
	String s6=s1+s2;
	String s3=new String("Rama");
	String s4=new String("Rama");
	System.out.println((s1==s2));
	System.out.println((s3==s4));
	System.out.println((s1==s3));
	System.out.println((s2==s4));
	System.out.println((s1.equals(s2)));
	System.out.println((s1.equals(s3)));
	System.out.println((s3.equals(s4)));
	System.out.println((s2.equals(s4)));
	System.out.println("Java"+"python");
	System.out.println("10"+"java");
	System.out.println("Java"+10+20);
	System.out.println("Java"+"10+20");
	System.out.println(10+20+"java");
	System.out.println(s5==s6);
	System.out.println(s5.equals(s6));
	StringBuffer sb=new StringBuffer("Hari");
	System.out.println(sb);
	StringBuilder sb1=new StringBuilder("Harika");
	System.out.println(sb1);
	sb.append(" harika");
	System.out.println(sb);
	
	
	
}
}
