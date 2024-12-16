import java.util.*;
public class PracticePrimeNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int no =sc.nextInt();

		int i,count=0;
		for(i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Number is prime number ");
		}
		else
		{
			System.out.println("Number is not prime number ");
		}
	}
}
