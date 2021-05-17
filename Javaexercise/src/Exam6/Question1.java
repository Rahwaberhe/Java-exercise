package Exam6;

import java.util.ArrayList;
import java.util.List;

public class Question1 {

	public static void main(String[] args) {
		List<Integer>Number = new ArrayList<Integer>();
		Number.add(4);
		Number.add(6);
		Number.add(5);
		Number.add(12);
		for (int i:Number) {
			if(i%3==0) {
				System.out.println(i+ ":" + "Magic Number");
			}
			else {
				System.out.println(i+":" + "not Magic Number");
			}
		}

			
		}

	
		
	} 
		
		

	
