import java.util.*;
public class FirstLast
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int no,rem,last=0,first=0;
		System.out.println("\nEnter the number ");
		no=xyz.nextInt();

         rem=no%10;
	     last=rem;
		while(no!=0)
		{
			first=no%10;
			no=no/10;
	    }
         int sum=0;
         sum=first+last;
		System.out.printf("First = %d \n Last = %d \n",first,last);
		System.out.printf("Sum of fiste and last number is : %d\n",sum);
    }
}
