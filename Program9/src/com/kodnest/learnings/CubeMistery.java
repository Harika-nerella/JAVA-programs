package com.kodnest.learnings;
import java.util.*;
public class CubeMistery {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println(cubeNumber(num));
	}
	public static int cubeNumber(int num) {
		return num*num*num;
	}

}
