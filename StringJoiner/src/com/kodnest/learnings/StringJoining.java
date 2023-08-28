package com.kodnest.learnings;

import java.util.*;
public class StringJoining {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		
		System.out.println(joinStrings(str1, str2));
		
	}
	public static String joinStrings(String str1, String str2)
	{
		return str1+str2;
	}

}
