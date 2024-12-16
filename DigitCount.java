import java.util.*;
public class DigitCount
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System .in);
		int no,rem,count;

		System.out.println("\nEnter the number ");
		no=xyz.nextInt();


		count=0;
		while(no!=0)
		{
			rem=no%10;
			count++;
			no=no/10;
	    }
	    System.out.printf("\nTotal digit in number is : %d\n",count);
   }
}