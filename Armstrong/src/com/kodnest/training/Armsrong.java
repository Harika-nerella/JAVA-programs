package com.kodnest.training;
import java.util.*;
public class Armsrong {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		App a=new App();
		int c=a.findLength(n);
		System.out.println(c);
		if(a.arm(n, c))
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
		s.close();
	}

}
