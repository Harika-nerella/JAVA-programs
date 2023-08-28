package com.kodnest.trainings;
import java.util.*;
public class Program {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int a[]=new int[s.nextInt()];
		System.out.println("the elements are");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the sizes to swap");
		int b=s.nextInt();
		int c=s.nextInt();
		
		System.out.println("Before the swapping the elements are");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int res[]=fun(a,b,c);
		System.out.println("After the swapping the elements are");
		for(int i:res)
		{
			System.out.print(i+" ");
		}
		s.close();
		
	}
	public static int[] fun(int a[], int b, int c)
	{
		int temp;
		temp=a[b];
		a[b]=a[c];
		a[c]=temp;
		return a;
	}

}
