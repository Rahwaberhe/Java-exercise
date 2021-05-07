package exercise2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		int age;
		Scanner check = new Scanner(System.in);
			System.out.print("Enter your age: ");
		age = check.nextInt();
		
		if (age >= 18)
			System.out.print("You are eligible to vote.");
		
		
		else if (age < 18)
		System.out.println("You are not eligible to vote");
		
			check.close();
		}
	}


