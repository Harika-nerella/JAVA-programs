package com.kodnest.learning;
import java.util.*;
public class SemisterAvaragerApp {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sem1=s.nextInt();
		int sem2=s.nextInt();
		int sem3=s.nextInt();
		int sem4=s.nextInt();
		int sem5=s.nextInt();
		int sem6=s.nextInt();
		int sem7=s.nextInt();
		int sem8=s.nextInt();
		SemisterAvarager a=new SemisterAvarager();
		System.out.printf("%.2f",a.calculateAverage(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8));
		s.close();
		
		
		
	}

}
