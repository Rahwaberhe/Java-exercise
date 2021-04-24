package Exercise4;

import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) {
		int[] my_array = {12, 45, 3, 23, 21,};
		  int[] new_array = new int[5];   
		 
		  System.out.println("Source Array : "+Arrays.toString(my_array));   
		  
		  for(int i=0; i < my_array.length; i++) {
		  new_array[i] = my_array[i];
		}
		  System.out.println("New Array: "+Arrays.toString(new_array));
		 }



	}


