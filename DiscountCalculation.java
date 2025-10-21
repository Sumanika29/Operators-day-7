package com.codegnan.operatorexamples;

import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Amount:");
		double totalAmount = sc.nextDouble();
		double result =totalAmount>=1000?(totalAmount*0.02):totalAmount>=500&totalAmount<=999?totalAmount*0.10:totalAmount*0;
		double finalAmount=totalAmount-result;
		System.out.println("discount amount "+result);
		System.out.println("Final Amount "+finalAmount);
		sc.close();

	}

}
