package homework1;

public class Player2 extends Cricket {
	
	String player2name;
	String bstyle;
	String prole;
	
	public Player2(String gamename,String p2name,String bs,String pr)
	{
		name=gamename;
		player2name=p2name;
		bstyle=bs;
		prole=pr;
	}
	
	public void output()
	{
		System.out.println("Player2");
		System.out.println("Player Name:"+player2name);
		System.out.println("Batting Style:"+bstyle);
		System.out.println("Playing role:"+prole);
	}
	
	public static void main(String[] args)
	{
		Player2 obj2=new Player2("Cricket","Sanju Viswanath Samson","Right hand Bat","Wicketkeeper Batter");
		obj2.print();
		obj2.output();

	}

}
