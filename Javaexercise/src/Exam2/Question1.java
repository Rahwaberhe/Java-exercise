package Exam2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		int marks[] = new int[4];
		int i;
		float total =0, avg;
		Scanner scanner = new Scanner(System.in);
		for(i=0; i<4; i++) {
			System.out.println("Enter marks of subject"+(i+1)+":");
		marks[i] = scanner.nextInt();
			total = total + marks[i];
			}
		scanner.close();
		avg = total/4;
		System.out.println("the student grade is : ");
		if(avg>=90) {
			System.out.println("A");
		}
		else if(avg>=80) {
			System.out.println("B");
		}
		else if(avg>=70) {
			System.out.println("C");
		}
		else if(avg>=50) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		
		
				

	}

}
