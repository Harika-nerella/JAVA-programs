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
		System.out.println("enter the size");
		int a2[]=new int[s.nextInt()];
		System.out.println("enter the elements of array2");
		for(int i=0;i<a2.length;i++)
		{
			a2[i]=s.nextInt();
		}
		Program p=new Program();
		int res[]=p.fun(a,a2);
		System.out.println(" the elements of array3");
		for(int i=0;i<res.length;i++)
		{
		    System.out.print(res[i]+" ");
		}
		s.close();
	}
	public  int[] fun(int a[],int a2[])
	{
		int a3[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			a3[i]=a[i]+a2[i];
		}
		return a3;
	}

}
