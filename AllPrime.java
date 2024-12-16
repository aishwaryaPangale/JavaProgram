import java.util.*;
public class AllPrime
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int count ,no,i,j,sum=0;

		System.out.println("\nEnter the number ");
		no=xyz.nextInt();

		for(i=1;i<=no;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.printf("%d\t",i);
				sum=sum+i;
			}

		}
		System.out.println("\nSum of Prime number is : "+sum);

	}
}
