import java.util.*;
public class SumOfNaturalNO
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System .in);
		int no,i,sum;
		System.out.println("\nEnter the number ");
		no=xyz.nextInt();

        sum=0;
        i=0;
		while(i<=no)
		{
			sum=sum+i;
			i++;
	    }

	    System.out.printf("Sum of natural number is : %d ",sum);
    }
}