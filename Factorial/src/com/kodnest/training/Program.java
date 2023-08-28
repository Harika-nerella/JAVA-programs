package com.kodnest.training;
import java.util.*;
public class Program {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		fun(n);
		s.close();
	}
	public static void fun(int n)
	{
		int s=1;
		for(int i=1;i<=n;i++)
		{
			s=s*i;
		}
		System.out.println(s);
	}


}
