import java.util.*;
class FindNArmstrong
{
	int n,i,j,count,sum,rem,p,temp;
	FindNArmstrong(int limit)
	{
		n=limit;
	}
	void showAllNumbersBetweenLimt()
	{
		for(i=1;i<=n;i++)
		{
			temp=i;
			count=0;
			while(temp!=0)
			{
				count++;
				temp=temp/10;
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
			if(sum==i)
			{
				System.out.println(i);
			}
		}

	}
}
public class FindNArmstrongApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limits ");
		int limit = sc.nextInt();

		FindNArmstrong f = new FindNArmstrong(limit);
		f.showAllNumbersBetweenLimt();
	}
}