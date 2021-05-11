package Exercise7;

import java.util.HashSet;
import java.util.Set;

public class Question2 {

	public static void main(String[] args) {

		
			Set<Integer> Set1 = new HashSet<>();
				Set1.add(3);
				Set1.add(4);
				Set1.add(5);
				Set1.add(7);
				Set1.add(8);
				Set1.add(9);
			Set<Integer> Set2 = new HashSet<>();
			    Set2.add(5);
			    Set2.add(2);
			    Set2.add(4);
			    Set2.add(6);
			    Set2.add(7);
			    Set2.add(11);
		 //A-find the intersection in those sets
		    Set<Integer>intersection = new HashSet<Integer>(Set1);
		    intersection.retainAll(Set2);
		    System.out.println(intersection);
		 //B find union on those sets
		    Set2.addAll(Set1);
		    System.out.println("union is :" + Set2);
		 //C find the only unique elements in set2
		    Set<Integer>unique = new HashSet<Integer>(Set2);
		    unique.removeAll(Set1);
		     System.out.println(unique);

	}

}
