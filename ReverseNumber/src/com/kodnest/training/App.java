package com.kodnest.training;

public class App {
	public int fun(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}

}
