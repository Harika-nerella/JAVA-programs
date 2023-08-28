package com.kodnest.trainings;
import java.util.*;
public class Program6 {
	public static void main(String[] args) {
		
	
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
	     fun(i);
	}
	s.close();
}
	public static void fun(int n)
	{
		boolean flag=true;
		int i;
		for( i=2;i<=n/2;i++)
		{
			if(n%i==0)
				flag=false;
				
		}
		if(flag)
			System.out.print(n+" ");
		
	}

}
