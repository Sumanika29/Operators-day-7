package com.codegnan.operatorexamples;

import java.util.Scanner;

public class DayGreeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Hour(12-hrs-fmt):");
		int hour=sc.nextInt();
		System.out.println("AM or PM");
		String amPm=sc.next();
		String greeting= (amPm.equalsIgnoreCase("am") && hour >= 5) ? "Good Morning":(amPm.equalsIgnoreCase("am") && hour < 5) ? "Good Night":(amPm.equalsIgnoreCase("am") && hour >= 5 && hour<=11) ? "Good Afternoon":(amPm.equalsIgnoreCase("am") && hour == 12) ? "Good Afternoon":"Good Evening";
		System.out.println(greeting);
		sc.close();

	}

}
