import java.util.*;
public class AllStrongNumber
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int no,i,j,rem,temp,sum,f;

		System.out.println("\nEnter the number ");
		no=sc.nextInt();

		for(i=1;i<=no;i++)
		{
			temp=i;
			sum=0;
			while(temp!=0)
			{
				rem=temp%10;
				f=1;
				for(j=1;j<=rem;j++)
				{
					f=f*j;
				}
				sum=sum+f;
				temp=temp/10;
			}
			if(sum==i)
			{
				System.out.println("\t"+i);
			}
		}
	}
}
