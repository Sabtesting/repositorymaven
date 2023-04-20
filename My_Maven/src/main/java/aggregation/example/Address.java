package aggregation.example;

public class Address {

	private String studadrs;
	private String cityname;
	private String state;
	private int pincode;
	private Student stud;
    
	public String getStudadrs() {
		return studadrs;
	}
	public void setStudadrs(String studadrs) {
		this.studadrs = studadrs;
	}

	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}


	public void print()
	{
		System.out.println("Student Name:"+stud.getStudname());
		System.out.println("Student Rollno:"+stud.getStudrollno());
		System.out.println("Student Address:"+getStudadrs());
		System.out.println("City Name:"+getCityname());
		System.out.println("State:"+getState());
		System.out.println("Pincode:"+getPincode());
	}

	
}
