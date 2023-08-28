package com.kodnest.trainings;
import java.util.*;

public class Program {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int a[]=new int[s.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int res[]=fun(a);
		System.out.println("the array elements are");
		for(int i:res)
		{
			System.out.print(i+" ");
		}
		s.close();
		
	}
	public static int[] fun(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i]+5;
		}
		return a;
	}

}
