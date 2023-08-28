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
		System.out.println("before sorting  the array elements are");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");;
		}
		System.out.println();
		
		System.out.println("enter 1--->bubble sort\nenter 2---->Insertion sort\nEnter 3--->Selection sort");
		int ch=s.nextInt();
		SearchingSortingApp se=new SearchingSortingApp();
		switch(ch)
		{
		case 1:se.Bubblesort(a);
		       break;
		case 2:se.Insertionsort(a);
		        break;
		default:se.Selectionsort(a);
		        
			
		}
		System.out.println("after sorting the array elements are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");;
		}
		System.out.println();
		System.out.println("enter 1--->linear search\nEnter 2--->BinarySearch");
		int op=s.nextInt();
		System.out.println("enter key to search");
		int key=s.nextInt();
		switch(op)
		{
		case 1:int r=se.LinearSearch(a,key);
		       if(r>0)
		       {
		    	   System.out.println("Key found at "+r);
		       }
		       else
		    	   System.out.println("Key not found");
		       break;
			
		case 2:int re=se.BinarySearch(a,key);
		        if(re>0)
		        	System.out.println("the key is fount at "+re);
		        else
		        	System.out.println("key not found");
		        break;
		//default:System.out.println();
		}
		s.close();
	}

}
