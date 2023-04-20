package inheritance;

public class Student extends Department {
	
	String studname;
	int rollno;
	
	public void input(String sdname,int rn)
	{
		studname=sdname;
		rollno=rn;
	}
	
	public void output()
	{
		System.out.println("Student name is: "+studname);
		System.out.println("Student roll no is: "+rollno);
		input("ECE");
		System.out.println("Department Name is: "+deptName);
	}
	

	public static void main(String[] args) {
		Student obj1=new Student();
		obj1.input("Ram",123);
		obj1.output();
		//obj1.input("ECE");
	
	}

}
