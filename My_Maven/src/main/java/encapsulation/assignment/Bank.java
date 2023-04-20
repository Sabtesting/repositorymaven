package encapsulation.assignment;

public class Bank {
	
	private String name;
	private int atmpin1;
	private int atmpin2;
	private int atmpin3;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAtmpin1() {
		return atmpin1;
	}
	public void setAtmpin1(int atmpin1) {
		this.atmpin1 = atmpin1;
	}


	public int getAtmpin2() {
		return atmpin2;
	}
	public void setAtmpin2(int atmpin2) {
		this.atmpin2 = atmpin2;
	}


	public int getAtmpin3() {
		return atmpin3;
	}
	public void setAtmpin3(int atmpin3) {
		this.atmpin3 = atmpin3;
	}


	public void validate(int apin)
	{
		if(apin==getAtmpin1()||apin==getAtmpin2()||apin==getAtmpin3()) 
		{
			System.out.println("Welcome "+getName());
		}
		else
		{
			System.out.println("Entered pin is incorrect");
		}
		
		}
	

}
