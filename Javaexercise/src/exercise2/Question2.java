package exercise2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		//check if an input starst with t
		
  Scanner input = new Scanner(System.in);
		
		String name = "tesfu";
		System.out.println("enter the first character : ");
		 name = input.nextLine();
		 if(name.startsWith("t"))
	{
     System.out.println("yes that is the string");
     
	}
    else
	System.out.println("that is not the string");
		 
		
		

	}

}
