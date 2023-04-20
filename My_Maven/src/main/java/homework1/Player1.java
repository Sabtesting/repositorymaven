package homework1;

public class Player1 extends Cricket{

	String player1name;
	String battingstyle;
	String playingrole;
	
	public Player1(String gname,String p1name,String bs,String pr)
	{
		name=gname;
		player1name=p1name;
		battingstyle=bs;
		playingrole=pr;
	}
	
	public void output()
	{
		System.out.println("Player1");
		System.out.println("Player Name:"+player1name);
		System.out.println("Batting Style:"+battingstyle);
		System.out.println("Playing role:"+playingrole);
	}
	
	public static void main(String[] args) {
		Player1 obj1=new Player1("Cricket","Simran Dil Bahadur","Left hand Bat","Bowling Allrounder");
		obj1.print();
		obj1.output();
		
		}

}
