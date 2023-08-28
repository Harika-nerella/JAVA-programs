package com.kodnest.trainings;
import java.util.*;
public class Program {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array length");
		int a[]=new int[s.nextInt()];
		System.out.println("the array elements are");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("the second highest element is "+a[a.length-2]);
		s.close();
	}
	

}
