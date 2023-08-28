package com.kodnest.trainings;
import java.util.*;
public class Descending_order {
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
		fun(a);
		System.out.println("after the sorting the elements are");
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		s.close();
	}
	public static void fun(int a[]) {
		int min;
		int pos;
		for(int i=0;i<a.length-1;i++)
		{
			min=a[i];
			pos=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(min<a[j])
				{
					min=a[j];
					pos=j;
				}
				
			}
			int t=a[i];
			a[i]=a[pos];
			a[pos]=t;
		}
	}


}
