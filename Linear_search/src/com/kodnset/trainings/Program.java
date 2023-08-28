package com.kodnset.trainings;
import java.util.*;
public class Program {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int a[]=new int[s.nextInt()];
		System.out.println("the elements are");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the key to search");
		int key=s.nextInt();
		if(fun(a,key))
		{
			System.out.println("the element is found");
		}
		else
			System.out.println("not found");
		s.close();
	}
	public static boolean fun(int a[],int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
				//System.out.println("the element is found at "+(i+1));
			return true;
		}
		return false;
	}
	

}
