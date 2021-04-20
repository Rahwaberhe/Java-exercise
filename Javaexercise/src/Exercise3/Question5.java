package Exercise3;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		System.out.print("Enter the value of x: ");
			while(sc.hasNextInt()) {
				System.out.print("Enter the value of y: ");
				double input = sc.nextDouble();
				total = (int) (total + input);
				
				count++;
			}
			System.out.println(total);
			int avg = 0;
			if(count>0) {
				avg = total/count;
			}
			
			System.out.println(" The average is: " + avg);	
			
			sc.close();

	}

}
