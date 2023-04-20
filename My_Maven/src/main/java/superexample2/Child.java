package superexample2;

public class Child extends Parent {
	
		//String name;
	int num;
	public void input(String sename,int num)
	{
		super.name=sename;
		name=sename;
		super.num=num; //parent class
		this.num=num; //child class
	}
	

	public void print()
	{
		System.out.println("Value is "+name);
		System.out.println("Number is "+num);
	}
	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.input("Reema",50);
		obj.print();
		obj.output();

	}

}
