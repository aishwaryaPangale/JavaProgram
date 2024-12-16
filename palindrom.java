import java.util.*;
public class Occurance
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System .in);
		int no,i,rem;
		int count=0;

		System.out.println("\nEnter the number ");
		no=xyz.nextInt();

		for(i=1;i<=9;i++)
		{
			while(no!=0)
			{
				rem=no%10;
				if(i==rem);
				{
					count++;
				}
				no=no/10;
			}
			System.out.printf("%d---%d",i,count);
		}
	}
}


