package encapsulation.assignment;

import java.util.Scanner;

public class Bank {
	
	private int atmpin;
	private float amount;

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getAtmpin() {
		return atmpin;
	}

	public void setAtmpin(int atmpin) {
		this.atmpin = atmpin;
	}
	
	public void validate()
	{
		int pin;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Atm Pin");
		pin=sc.nextInt();
		if(pin==atmpin)
		{
			System.out.println("Enter the Amount to withdraw: ");
		}
		else
		{
			System.out.println("Incorrect pin");
			System.out.println("Enter the valid pin");
		}
	}
	

}
