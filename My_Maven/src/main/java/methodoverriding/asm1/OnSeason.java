package methodoverriding.asm1;

import java.util.*;
public class OnSeason extends OffSeason {
	
	
public OnSeason(float prod1,float prod2,float prod3)
{
	bill=prod1+prod2+prod3;
	System.out.println("Bill Amount:"+bill);
	
}

public void check(int num)
{
	if(num==1)
	{
		super.discount();
	}
	else
	{
		discount();
	}
}

public void discount()
{
	dis=(bill*40)/100;
	total=bill-dis;
	System.out.println("Discounted Amount if OnSeason: "+dis);
	System.out.println("Total Amount payable after discount: "+total);
	
	}
	
public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.OFF Season");
		System.out.println("2.ON Season");
		System.out.println("Enter the Option");
		n=sc.nextInt();
		
		OnSeason obj=new OnSeason(500f,700f,600f);
		obj.check(n);
		}
}

		
