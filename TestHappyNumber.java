import java.util.*;
public class TestHappyNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int rem,sum=0;
		System.out.println("Enter the number ");
		int no=sc.nextInt();

		while(no!=1&&no!=4)
		{
			 sum=0;
			while(no!=0)
			{
				rem=no%10;
				sum=sum+rem*rem;
				no=no/10;
			}
			no=sum;
		}
		if(sum==1)
		{
			System.out.println("Number is Happy Number ");
		}
		else
		{
			System.out.println("Number is not Happy Number ");
		}
	}
}
