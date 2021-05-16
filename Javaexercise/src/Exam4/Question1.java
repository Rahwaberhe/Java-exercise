package Exam4;

public class Question1 {

	public static void main(String[] args) {;
	int v = 0;  
	
	String str = "africa";
	
	for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
				|| str.charAt(i) == 'u') {
			v++;
		}
	}
	System.out.print("The count is: " + v);
}

	}

	
	
	