package com.kodnest.trainings;
import java.util.*;
public class program {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int a[]=new int[s.nextInt()];
		System.out.println("the elements are");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("the elements in array1 are");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("the elements in array2 are");
		int res[]=fun(a);
		
		for(int i:res)
		{
			System.out.print(i+" ");
		}
		s.close();
		
	}
	public static int[] fun(int a[])
	{
		int a2[]=new int[a.length];
		for(int i=0;i<a2.length;i++)
		{
			a2[i]=a[i];
		}
		return a2;
	}

}
