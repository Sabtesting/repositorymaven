package inheritance.example;

public class Child extends Parent {
	
	public void printchild()
	{
		printparent();
		System.out.println("Child class");
		
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.printchild();
		//obj.printparent();
		//Parent obj1=new Parent();  
		//obj1.printparent();
		

	}

}
