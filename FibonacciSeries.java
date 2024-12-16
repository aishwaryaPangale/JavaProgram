import java.util.*;
public class FibonacciSeries
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no,x=0,y=1,sum=0,i;

		System.out.println("\nEnter number for fibonacci series ");
		no=sc.nextInt();


 		System.out.print("\t0\t1");
		for(i=1;i<=no;i++)
		{
			sum=x+y;
			System.out.print("\t"+sum);
			x=y;
			y=sum;

		}

	}
}
