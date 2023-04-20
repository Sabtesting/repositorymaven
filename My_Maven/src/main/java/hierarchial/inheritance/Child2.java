package hierarchial.inheritance;

public class Child2 extends Parent {
	
	public void printchild2()
	{
		System.out.println("Child2 Method");
	}
	
	public static void main(String[] args) {
		Child2 obj2=new Child2();
		obj2.printchild2();
		obj2.printparent();

	}

}
