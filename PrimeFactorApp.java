import java.util.*;
public class PrimeFactorApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int no,count,i,temp=0,j;

		System.out.println("\nEnter the number ");
		no=sc.nextInt();


	   for(i=2;i<=no;i++)
		{
			while(no%i==0)
			{
				System.out.println(i);
				no=no/i;
			}
		}

	}
}



