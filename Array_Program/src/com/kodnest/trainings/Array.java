package com.kodnest.trainings;
import java.util.*;
public class Array {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int a[]=new int[s.nextInt()];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("the array elements are");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		s.close();
	}

}
