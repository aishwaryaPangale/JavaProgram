import java.util.*;
public class PrimeApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int no,count=0,i=1;

		System.out.println("\nEnter the number ");
		no=xyz.nextInt();

		while(i<=no)
		{
			if(no%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
		{
			System.out.printf("\nNumber is prime number\n ");
		}
		else
		{
			System.out.println("\nNumber is not prime number\n ");
		}
	}
}