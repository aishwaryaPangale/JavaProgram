import java.util.*;
public class AllArmstrongNumber
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int no,i,j,rem,count,sum ,temp,p;
		System.out.println("\nENter the number ");
		no=xyz.nextInt();

		for(i=1;i<=no;i++)
		{
			temp=i;
			count=0;
			while(temp!=0)
			{
			     temp=temp/10;
				count++;

			}

			temp=i;
			sum=0;
			while(temp!=0)
			{
				rem=temp%10;
				p=1;
				for(j=1;j<=count;j++)
				{
					p=p*rem;
				}
				sum=sum+p;
				temp=temp/10;
			}
			temp=i;
			if(temp==sum)
			{
				System.out.println(temp);
			}
		}
	}
}


