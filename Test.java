import java.util.*;
public class Test
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int no=sc.nextInt();

		int i,j,count=0;
		for(i=1;i<=no;i++)
		{
			count=0;
			for(j=1;j<=i;i++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("\t"+i);
			}
		}
	}
}