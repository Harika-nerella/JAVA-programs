package com.kodnest.trainings;
import java.util.*;
public class Program {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int a[]=new int[s.nextInt()];
		System.out.println("enter the elements of array 1");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int res[]=fun(a);
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
			if(a[i]<0)
				a[i]=0;
		}
		return a;
	}

}
