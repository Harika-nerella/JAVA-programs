package com.kodnest.trainings;
import java.util.*;
public class Program3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String s1=s.nextLine();
	
		char ch[]=s1.toCharArray();
		//int n=ch.length;
		char ch1[]=new char[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			ch1[i]=ch[ch.length-i-1];
		}
		s1=new String(ch1);
		System.out.println(s1);

}
}
