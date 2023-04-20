package inheritance.types.assignment;

import java.util.Scanner;

public class SalarySlip extends Allowance {
	
	float salary;
	
	public void output()
	{
		salary=basicpay+hra+bonus-pf-deduction;
	}
	
	public void employeesalary()
	{	
		
		System.out.println("Employee Name:"+empname);
		System.out.println("Basicpay:"+basicpay);
		System.out.println("Bonus:"+bonus);
		System.out.println("Deduction:"+deduction);
		System.out.println("HRA: "+hra);
		System.out.println("PF: "+pf);
		System.out.println("Inhand Salary:"+salary);
			
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Employee:");
		empname=sc.nextLine();	
		System.out.println("Enter the basicpay:");
		basicpay=sc.nextFloat();
		System.out.println("Enter the bonus:");
		bonus=sc.nextFloat();
		System.out.println("Enter the deductions if any:");
		deduction=sc.nextFloat();
				
		
	SalarySlip ssp=new SalarySlip();
	ssp.employeeallowance();
	System.out.println("Salary Slip");
	ssp.output();
	ssp.employeesalary();
	}

}
