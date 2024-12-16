import java.util.*;
public class Factors
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int no,i;

		System.out.println("\nEnter the number ");
		no=sc.nextInt();

		for(i=1;i<no;i++)
		{
			if(no%i==0)
			{
				System.out.printf("%d\t",i);
			}
		}
	}
}