package com.codegnan.operatorexamples;

import java.util.Scanner;

public class BankAccountStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account balance:");
		long accountBalance=sc.nextInt();
		String result=accountBalance>=1000?"Good Standing":accountBalance>=500?"Low Balance":"Account Overdrawn";
		System.out.println(result);
		sc.close();

	}

}
