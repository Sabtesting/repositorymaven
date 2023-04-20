package encapsulation.student;

public class Address {
	
	String studaddress;
	String cityname;
	String state;
	int pincode;
	Student stud;
	
public Address(String sadd,String scn,String st,int pc,Student std)
{
	studaddress=sadd;
	cityname=scn;
	state=st;
	pincode=pc;
	stud=std;
}

public void print()
{
	System.out.println("Student Name:"+stud.studname);
	System.out.println("Student Rollno:"+stud.studrn);
	System.out.println("Student Address:"+studaddress);
	System.out.println("City Name:"+cityname);
	System.out.println("State:"+state);
	System.out.println("Pincode:"+pincode);
}



}
