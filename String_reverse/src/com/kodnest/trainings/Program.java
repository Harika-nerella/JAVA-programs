package com.kodnest.trainings;
import java.util.*;
public class Program {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String s1=s.nextLine();
	
		char ch[]=s1.toCharArray();
		//int n=ch.length;
		char ch1[]=new char[ch.length];
		int j=ch.length-1;
		for(int i=0;i<ch.length;i++)
		{
			ch1[j]=ch[i];
			j--;
		}
		s1=new String(ch1);
		System.out.println(s1);
	
		
	}

}
