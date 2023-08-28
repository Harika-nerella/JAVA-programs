package sum_arraycom.kodnest.trainings;

import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter size");
	int a[]=new int[s.nextInt()];
	System.out.println("the elements are");
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("the sum is"+sum);
	
	}

}
