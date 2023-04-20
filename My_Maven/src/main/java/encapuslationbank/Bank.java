package encapuslationbank;

public class Bank{
	
	private String cust_name;
	private float amount;
	
	
	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

public void calculate()
{
	float i;
	i=((amount*2*7)/100);
	amount+=i;
}

}
