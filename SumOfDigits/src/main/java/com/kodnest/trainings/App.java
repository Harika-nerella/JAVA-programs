package com.kodnest.trainings;

public class App {
	public static int fun(int n)
	{
		int s=0;
		while(n!=0)
		{
			int r=n%10;
			s=s+r;
			n=n/10;
		}
		return s;
	}

}
