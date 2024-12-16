import java.util.*;
public class MultiplicationTabel
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int no,i;
		System.out.println("\nEnter the number ");
		no=xyz.nextInt();

		i=1;
		while(i<=10)
		{
			System.out.printf("%d * %d = %d\n",i,no,i*no);
		     i++;
	    }
     }
}