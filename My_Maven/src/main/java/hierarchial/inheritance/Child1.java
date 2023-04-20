package hierarchial.inheritance;

public class Child1 extends Parent{

	public void printchild1()
	{
		System.out.println("Child1 Method");
	}
	
	public static void main(String[] args) {
		Child1 obj1=new Child1();
		obj1.printchild1();
		obj1.printparent();

	}

}
