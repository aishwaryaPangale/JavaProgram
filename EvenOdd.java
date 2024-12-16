public class EvenOdd
{
	public static void main(String x[])
	{
		int i=1;
		System.out.printf("\nEven number\n ");
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.printf("%d\t",i);
			}
			i++;
		}
		
		i=1;
		System.out.printf("\nOdd number\n ");
		while(i<=100)
		{
			if(i%2!=0)
			{
				System.out.printf("%d\t",i);
			}
			i++;
		}
	}
}
			