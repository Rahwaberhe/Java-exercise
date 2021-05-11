package Exercise7;


import java.util.ArrayList;
import java.util.List;

public class Question3 {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		
		myList.add(1);
		myList.add(2);
		myList.add(4);
		myList.add(4);
		myList.add(5);
		myList.add(5);
		
		for(int a = 0; a< myList.size();a++){
			int b = myList.get(a);
			if(b%2==0) {
				myList.remove(a);
				a--;
			}
		}
       System.out.println(myList);
	}

}
