package com.kodnest.learning;
import java.util.*;
public class PlanetExplorer {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double radius=s.nextDouble();
		PlanetExplorer p=new PlanetExplorer();
		System.out.printf("%.2f",p.calculateSurfaceArea(radius));
		s.close();
		
	}
	public double calculateSurfaceArea(double radius)
	{
		return 4*3.14156*radius*radius;

	}

}
