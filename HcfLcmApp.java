import java.util.*;
public class HcfLcmApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a,b,i,gcd=1,lcm;

		System.out.println("\nEnter two number ");
		a=xyz.nextInt();
		b=xyz.nextInt();

		for(i=1;i<a && i<b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				System.out.print("\t"+i);
				gcd=i;
			}

		}
		lcm=a*b/gcd;
		System.out.printf("\nHCF = %d\n",gcd);
		System.out.printf("\nLCM = %d\n",lcm);

	}
}