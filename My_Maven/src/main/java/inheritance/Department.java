package inheritance;

public class Department {
	String deptName;
	
	public void input(String dpname)
	{
		deptName=dpname;
		//System.out.println("Department Name is: "+deptName);
	}

	public static void main(String[] args) {
		
		Department obj=new Department();
		obj.input("ECE");
	}

}
