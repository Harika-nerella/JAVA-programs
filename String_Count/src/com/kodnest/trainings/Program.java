package com.kodnest.trainings;
import java.util.*;
public class Program {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.nextLine();
		String str1[]=str.split(" ");
		int n=str1.length;
		int c;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(str1[i]==str1[j])
				{
					for(int k=j;k<n;k++)
					{
						str1[k]=str1[k+1];
					}
					n--;
					
				}
			}
		}
		for(int i=0;i<n;i++)
			
		System.out.println(str1[i]);
		//for(int i=0;i<n;i++)
		{ 
			c=0;
			//for(int j=i+1;j<n;j++)
			{   
				
			//	if(str1[i]==str1[j])
				{
					c++;
				}
				
					
			}
			//System.out.println(str1[i]+" is occured "+c+" times");
		}//
	}

}
