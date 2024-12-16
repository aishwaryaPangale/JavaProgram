import java.util.*;
public class Sample
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(system.in);
		system.out.println("Enter the limit ");
		int limit = sc.nextInt();

		int i,j,count,temp,rem,p;
		for(i=0;i<=limit;i++)
		{
			temp=i;
			count=0;
			while(temp!=0)
			{
				count++;
				temp=/temp;
			}

			int sum=0;
			temp=i;
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
				System.out.print(i+"\t");
			}
		}
	}
}
