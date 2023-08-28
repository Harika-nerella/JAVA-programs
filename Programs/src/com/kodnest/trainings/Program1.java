package com.kodnest.trainings;
import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		fun(n);
		s.close();
	}
	public static void fun(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%2==0)
				System.out.print(i+" ");
		}
	}

}
