package methodoverriding.asm1;

public class OffSeason {
	
	float bill,dis,total;
	
	public void discount()
	{
		dis=(bill*15)/100;
		total=bill-dis;
		System.out.println("Discounted Amount if OffSeason: "+dis);
		System.out.println("Total Amount payable after discount: "+total);
	}


}
