package Exercise7;

import java.util.HashMap;
import java.util.Map;

public class Question1 {

	public static void main(String[] args) {
//Create a map
	Map<String, String> colors = new HashMap<>();
		colors.put("OR", "orange");
		colors.put("PK", "pink");
		colors.put("RD", "red");
//Add some key value pairs
		System.out.println(colors.keySet());
//Write a logic to get value of a given key
		System.out.println(colors.values());
		
		
		
		

	}

}
