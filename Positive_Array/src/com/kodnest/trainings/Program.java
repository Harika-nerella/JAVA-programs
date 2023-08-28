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
		System.out.println("the array is");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
				System.out.print(a[i]+" ");
		}
		s.close();


	

	}

}
