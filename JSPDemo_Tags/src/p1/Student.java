package p1;

public class Student {

	private String name;
	private String course;
	private int age;
	private int marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String course, int age, int marks) {
		super();
		this.name = name;
		this.course = course;
		this.age = age;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", age=" + age + ", marks=" + marks + "]";
	}
	

	public boolean validateStudent() {
		
		if(age>18) return true;
		else return false;
	}
	
	
}
