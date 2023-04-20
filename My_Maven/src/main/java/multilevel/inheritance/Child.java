package multilevel.inheritance;

public class Child extends Parent {
	
	public void printchild()
	{
			System.out.println("Child class");
	}

		
	public static void main(String[] args) {
		
		Child2 obj1=new Child2();
		obj1.printparent();
		obj1.printchild();
		obj1.printchild2();
		Child obj2=new Child();
		obj2.printparent();
		obj2.printchild();
		Parent obj3=new Parent();
		obj3.printparent();

	}

}
