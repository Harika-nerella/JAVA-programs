package com.kodnest.training;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		App a=new App();
		if(a.fun(n))
		System.out.println("Palindrome");
		else
		System.out.println("Not Palindrome");
		s.close();
	}

}
