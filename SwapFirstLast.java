import java.util.*;
pulic class SwapFirstLast
{
	public static void main(String x[])
	{
		scanner xyz = new Scanner(System.in);
		int no,first=0,last=0,rem;

		System.out.println("\nEnter the number ");
		no=xyz.nextInt();

		last=no%10;
		while(no!=0)
		{
			first=no%10;
			no=no/10;
	     }
