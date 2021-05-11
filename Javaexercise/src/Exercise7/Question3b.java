package Exercise7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question3b {

	public static void main(String[] args) {
List<Integer> myList = new ArrayList<>();
		
		myList.add(1);
		myList.add(2);
		myList.add(4);
		myList.add(4);
		myList.add(5);
		myList.add(5);
		
	Iterator iter = myList.iterator();
	while(iter.hasNext()) {
		if((Integer)iter.next()%2==0) {
			iter.remove();
		}
			
	}
	System.out.println(myList);

	}

}
