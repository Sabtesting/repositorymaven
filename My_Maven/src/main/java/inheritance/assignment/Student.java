package inheritance.assignment;

public class Student extends Department
{
	
	String studentname;
	int rollno;
	float totalmark;
	
	public Student(String sname,int rn,float tm,String dname,int did)
	{
		studentname=sname;
		rollno=rn;
		totalmark=tm;
		deptname=dname;
		deptid=did;
	}

	public void output()
	{
		System.out.println("Student name is:"+studentname);
		System.out.println("Roll no is:"+rollno);
		System.out.println("Total mark is:"+totalmark);
	}
	public static void main(String[] args)
	{
		Student std=new Student("Geetha",123,95.6f,"ECE",02);
		std.output();
		std.print();
	}

}
