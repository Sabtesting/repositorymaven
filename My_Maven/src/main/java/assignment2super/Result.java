package assignment2super;

public class Result extends Addition {
	
	public void print()
		{
		super.input(25.5f,35.5f);
		super.print();
		if(sum%10==0)
		{
			System.out.println(sum+ " is divisible by 10");
		}
		else
		{
			System.out.println(sum+ " is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		Result obj1=new Result();
	    obj1.print();
		
		
	}

}
