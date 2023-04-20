package homework1;

public class Employee extends Company {
	
	String empName;
	int empid;
	
public void input(String Name,int id)
{
	empName=Name;
	empid=id;
	
	System.out.println("Employee Name is:"+empName);
	System.out.println("Employee Name is:"+empid);
}
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.input("Likhitha",450);
		emp.print();
		
		

		
		
			}

}
