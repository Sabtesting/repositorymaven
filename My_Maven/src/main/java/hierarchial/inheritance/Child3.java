package hierarchial.inheritance;

public class Child3 extends Parent {
	
	public void printchild3()
	{
		System.out.println("Child3 Method");
	}
	
	public static void main(String[] args) {
		Child3 obj3=new Child3();
		obj3.printchild3();
		obj3.printparent();

	}

}
