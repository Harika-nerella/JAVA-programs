package com.kodnest.training;
import java.util.*;
public class Pattren9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows");
		int r=s.nextInt();
		System.out.println("enter stars in each side of square");
		int side=s.nextInt();
		int stars=1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r-i;j++) {
			    System.out.print(" ");
			}
			    for(int k=1;k<=stars;k++) {
			       if(k==1 || k==stars || i==r) {
			    	System.out.print("*");
			       }
			       else {
			    	   System.out.print(" ");
			       }
			    }
			    stars+=2;
			System.out.println();
			
			
		}
		for(int i=0;i<side;i++)
		{
			for(int j=0;j<side;j++)
			{
				if(i==0 || i==side-1 || j==0 || j==side-1)
					System.out.print(" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
  