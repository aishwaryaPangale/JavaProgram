import java.util.*;
public class Question9
{
	public static void main(String x[])
	{
		System.out.println("Enter two number ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();

		int i,gcd=1,lcm=1;
		for(i=1;i<a&&i<b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				//System.out.print(i+"\t");
				gcd=i;
			}
		}
		lcm = a*b/gcd;
		//System.out.println("HCF = :"+gcd);
		System.out.println("LCM = :"+lcm);
	}
}
