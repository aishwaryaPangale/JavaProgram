import java.util.*;
public class AllPerfectNumber
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int no,i,sum,j;

		System.out.println("\nEnter nember ");
		no=sc.nextInt();

		for(i=1;i<=no;i++)
		{
			sum=0;
			for(j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				System.out.println("\t"+i);
			}
		}
	}
}