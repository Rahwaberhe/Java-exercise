package Exercise3;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);{
			
			System.out.println("Enter the value of x: ");
			int x=input.nextInt();
			
			int counter=x;
			
			do
			{
				if(counter % 2 == 0)
				{
				System.out.println(counter);
			
			}
				counter--;
			}while(counter > 0);
		}
				input.close();
		}
	

	}


