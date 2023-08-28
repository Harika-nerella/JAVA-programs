package com.kodnest.trainings;

public class SearchingSortingApp {
	public void Bubblesort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	}
	public void Insertionsort(int a[])
	{
		int item;
		for(int i=1;i<a.length;i++)
		{
			item=a[i];
			int j=i-1;
			while(j>=0&&a[j]>item)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=item;
		}
	}
	public void Selectionsort(int a[])
	{
		int min;
		int pos;
		for(int i=0;i<a.length-1;i++)
		{
			min=a[i];
			pos=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(min>a[j])
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
	public int LinearSearch(int a[],int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
				//System.out.println("the element is found at "+(i+1));
			return i;
		}
		return 0;
		
	}
	public int BinarySearch(int a[],int key)
	{
		int l=0;
		int h=a.length-1;
		
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(key==a[mid])
				return mid;
			else if(key>a[mid])
				l=mid+1;
			else
				h=mid-1;
		}
		return 0;
	}
	

}
