package encapsulation.student;

public class Output {

	public static void main(String[] args) {
		
		Student studobj1=new Student("Pinky",220);
		Address addrobj2=new Address("Peroorkada","Trivandrum","Kerala",695005,studobj1);
		addrobj2.print();

	}

}
