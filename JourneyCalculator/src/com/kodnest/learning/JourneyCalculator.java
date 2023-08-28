package com.kodnest.learning;
import java.util.*;
public class JourneyCalculator {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	JourneyCalculator j=new JourneyCalculator();
	double speed=s.nextDouble();
	double time=s.nextDouble();
	
	System.out.printf("%.2f",j.calculateDistance(speed,time));
	
}
public double calculateDistance(double speed, double time)
{
	return speed*time;
}
}
