package exercise2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	System.out.print("Enter you age: ");
	int age = input.nextInt();
	System.out.println("Your age is: " + age);
	if(age >= 18)
	{
	  System.out.println("eligible to vote");
	  
	   
	}
	else
	{
	System.out.println("not eligible to vote");
	
	
	
	
	}

	}

}
