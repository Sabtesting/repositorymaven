package encapsulation.assignment;

import java.util.Scanner;

public class User {

	
	public static void main(String[] args) {
		String usrName;
		int pin;
		Bank obj=new Bank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		usrName=sc.nextLine();
		System.out.println("Enter your atmpin");
		pin=sc.nextInt();
				
		obj.setAtmpin1(1001);
		obj.setAtmpin2(1234);
		obj.setAtmpin3(1212);
		obj.setName("Sabitha");
		obj.validate(pin);
		}

}
