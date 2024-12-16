import java.util.*;
public class DigitSwap
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int no,temp;
		double count=0,npow,last,first,mid,swap,fpower;

		System.out.println("Enter the number ");
		no=sc.nextInt();

		temp=no;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		last=no%10;
		no=no/10;

		npow=Math.pow(10,(count-2));

		mid=no%npow;

		first=no/npow;

		fpower=Math.pow(10,(count-1));

		swap=((last*fpower)+(mid*10)+first);

		System.out.println("Swap number is : "+(int)swap);
	}
}


