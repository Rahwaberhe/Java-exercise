package Question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Studentmain {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Hagos",20));
		students.add(new Student("Zeray",18));
		students.add(new Student("Tirhas",25));
		students.add(new Student("Seble",23));
		System.out.println(students);
		//Sort the students list with firstName
		//hint use Collections.sort()}
		Collections.sort(students);
		System.out.println(students);
	}

}
