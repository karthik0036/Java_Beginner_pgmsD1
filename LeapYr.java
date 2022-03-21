package com.bridge.D1_assignments;

import java.util.Scanner;

public class LeapYr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		System.out.println("Enter an Year : ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		if( year<9999) {
			if(((year % 4 == 0)&&(year % 100 != 0) || (year%400==0))) {
				System.out.println("specified year is a leap year");
			}
			else {
				System.out.println("specified year is not a leap year");
			}
		}else {
			System.out.println("enter valid 4 digits only");
		}
		sc.close();

	}

}
