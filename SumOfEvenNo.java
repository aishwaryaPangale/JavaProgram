import java.util.*;
public class SumOfEvenNo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int no,i;
		System.out.println("\nEnter the number ");
		no=xyz.nextInt();

		i=1;
		int sum=0;
		while(i<=no)
		{
			if(i%2==0)
			{
		        sum=sum+i;
		    }
		    i++;
	    }
		System.out.printf("\nSum of Even number is : %d\n",sum);

		i=1;
		sum=0;
		while(i<=no)
		{
			if(i%2!=0)
			{
				sum=sum+i;
		    }
		    i++;
	    }
	    System.out.printf("\nSum of Odd number is : %d\n",sum);


    }
}