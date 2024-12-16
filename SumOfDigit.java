import java.util.*;
public class SumOfDigit
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int no,rem,sum=0,p=1;
		System.out.println("\nEnter the number ");
		no=xyz.nextInt();

		while(no!=0)
		{
			rem=no%10;
			sum=sum+rem;
			p=p*rem;
			no=no/10;
	    }
	    System.out.printf("\nSum of Digit is : %d\n",sum);
	    System.out.printf("\nProduct of Difits is : %d\n",p);

   }
}
