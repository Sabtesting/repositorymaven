package aggregation.example;

public class Output {

	public static void main(String[] args) {
		
		Student obj1=new Student();
		Address obj2=new Address();
		
		obj1.setStudname("Sabitha");
		obj1.setStudrollno(200);
		
		
		obj2.setStudadrs("Peroorkada");
		obj2.setCityname("Trivandrum");
		obj2.setState("Kerala");
		obj2.setPincode(695005);
		obj2.setStud(obj1);
		obj2.print();
	}

}
