package superexample;

public class Child extends Parent {
	
	public Child(String name)
	{
		super(27);
		System.out.println("Child Constructor "+name);
	}

	public void print()
	{
		super.print();
		System.out.println("Child Class");
	}
	
	public static void main(String[] args) {
		Child obj=new Child("Sabitha");
		obj.print();
		

	}

}
