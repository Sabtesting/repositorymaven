package encapsulationclass;

import encapuslationbank.Bank;

public class Customer {
	
	

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.setCust_name("Sabitha");
		obj.setAmount(20000);
		obj.calculate();
		System.out.println("Name: "+obj.getCust_name());
		System.out.println("Amount: "+obj.getAmount());
			}

}
