package com.kodnest.training;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sides=s.nextInt();
		identifyPolygon(sides);
		s.close();
	}
	public static void identifyPolygon(int sides)
	{
		if(sides==3)
			System.out.println("Triangle");
		else if(sides==4)
			System.out.println("Quadrilateral");
		else if(sides==5)
			System.out.println("pentagon");
		else if(sides==6)
			System.out.println("hexagon");
		else
			System.out.println("polygon");
	}

}
