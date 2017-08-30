package compare;

public class Student implements Comparable{

	int rollNo;
	String name;
	int age;
	Student(int rollNo, String name, int age){
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
//		Student s = (Student) o;
//		if(this.name.equals(s.name))
//			return 0;
//		if(this.name>s.name)
			
		return 0;
	}
}
