package com.codegnan.operatorexamples;

import java.util.Scanner;

public class TemperatureClassification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature(in celcius):");
		double temperature=sc.nextDouble();
		String classification=temperature>30?"Hot":temperature>15?"Moderate":"Cold";
		System.out.println(classification);
		sc.close();

	}

}
