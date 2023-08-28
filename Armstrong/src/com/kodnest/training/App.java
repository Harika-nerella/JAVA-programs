package com.kodnest.training;

public class App {
	public int findLength(int n)
	{
		int c=0;
		while(n!=0)
		{
			//int r=n%10;
			//c++;
			n=n/10;
			c++;
		}
		return c;
	}
	public boolean arm(int n,int c)
	{
		int m=n;
		int s=0;
		while(n!=0)
		{
			int r=n%10;
			s=s+(int)(Math.pow(r, c));
			n=n/10;
			
			
		}
		if(m==s)
		    return true;
		else
			return false;
	}

}
