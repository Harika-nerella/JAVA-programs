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
		System.out.println("enter key to search");
		int key=s.nextInt();
		int r=fun(a,key);
		if(r==1)
		{
			System.out.println("the element is found");
		}
		else
			System.out.println("element is not found");
		s.close();
	}
	public static int fun(int a[],int key)
	{
		Arrays.sort(a);
		int l=0;
		int h=a.length-1;
		
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(key==a[mid])
				return 1;
			else if(key>a[mid])
				l=mid+1;
			else
				h=mid-1;
		}
		return 0;
	}

}
