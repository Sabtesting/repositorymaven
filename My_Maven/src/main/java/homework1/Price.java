package homework1;

public class Price extends Brand{
	
	float cost;
	
	public Price(String vt,String bn,float ml,float ct)
	{
		vtype=vt;
		brandname=bn;
		model=ml;
		cost=ct;
	}

	public void modelprint()
	{
		System.out.println("Price is:"+cost);
	}
	public static void main(String[] args) {
		
		Price obj=new Price("Car","Maruti Alto",2017f,800000f);
		obj.vehicleprint();
		obj.bnamemodelprint();
		obj.modelprint();
		
	}

}
