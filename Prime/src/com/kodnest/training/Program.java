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
		boolean flag=true;
		int i;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
				flag=false;
		}
		if(flag)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

}
