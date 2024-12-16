import java.util.*;
class Power
{
	int base,index,i,p=1;
	void setValue(int a,int b)
	{
		base=a;
		index=b;
	}
	void showPower()
	{
		for(i=1;i<=index;i++)
		{
			p=p*base;
		}
		System.out.println("Power is : "+p);
	}
}
public class PowerApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and index ");
		int base=sc.nextInt();
		int index=sc.nextInt();

		Power p =new Power();
		p.setValue(base,index);
		p.showPower();
	}
}
