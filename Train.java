package com.example.app;

import java.util.Scanner;

public class Train {

	public static String getBerthType(int n) {
		return (n%8==1 || n%8==4)?"Lower":(n%8==2 || n%8==5)?"Middle":(n%8==3 || n%8==6)?"Upper":(n%8==7)?"Side Lower":"Side Upper";
	}
	public static void main(String[] args) {
		System.out.print("Enter seat number:");
		Scanner sc = new Scanner(System.in);
		int seat = sc.nextInt();
		System.out.println(getBerthType(seat));
		sc.close();
	}
}
