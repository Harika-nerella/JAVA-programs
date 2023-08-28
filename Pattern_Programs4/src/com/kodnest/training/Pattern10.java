package com.kodnest.training;
import java.util.*;
public class Pattern10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||j==n||i==j)
				{
					System.out.print("#");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		s.close();
	}
	

}
