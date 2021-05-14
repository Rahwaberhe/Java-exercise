package Question4;

public class Student implements Comparable<Student>{
	private String firstName;
	private int age;
	
	//constructor here
	public Student(String firstName, int age) {
		super();
		this.firstName = firstName;
		this.age = age;
	}
	
	//getter and setters here
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	//add toString methode here
	@Override
	public String toString() {
		return "Student [name=" + firstName + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return this.getFirstName().compareTo(o.getFirstName());
			
	}
	
	
}

	


