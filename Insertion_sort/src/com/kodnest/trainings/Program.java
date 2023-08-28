package com.kodnest.trainings;
import java.util.*;
public class Program {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter array length");
		int a[]=new int[s.nextInt()];
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("before the sorting the elements are");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		Demo.fun(a);
		System.out.println("after the sorting the elements are");
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		s.close();
	}
	 

}
