package com.codegnan.operatorexamples;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Income:");
		long income=sc.nextLong();
		double tax=income<300000?income*0.05:income>=300000 && income<=100000?income*0.10:income*0.15;
		double totalTaxAmount=income>200000?tax*0.01:0;
		System.out.println("tax: "+tax);
		System.out.println("Special Bonus: "+totalTaxAmount);
		sc.close();


	}

}
