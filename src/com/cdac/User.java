package com.cdac;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        System.out.println("Welcome, " + name + " to my repository!");
	}

}
