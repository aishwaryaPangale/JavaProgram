import java.util.*;
public class Occurance
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System .in);
		int no,i,rem=0,temp;
		int count;

		System.out.println("\nEnter the number ");
		no=xyz.nextInt();


		for(i=0;i<=9;i++)
		{
			count=0;
			temp=no;
			while(temp!=0)
			{
				rem=temp%10;
				if(i==rem)
				{
					count++;
				}
				temp=temp/10;
			}

				System.out.printf("%d---%d\n",i,count);
		}

	}
}


