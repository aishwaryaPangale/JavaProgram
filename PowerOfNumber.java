import java.util.*;
public class PowerOfNumber
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int i,base,index;

		System.out.println("\nEnter the base and index of number ");
		base=xyz.nextInt();
		index=xyz.nextInt();

		int p=1;
		for(i=1;i<=index;i++)
		{
			p=p*base;
		}
		System.out.printf("\nPower of %d is : %d\n",base,p);
	}
}