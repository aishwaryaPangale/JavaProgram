import java.util.*;
class DigitSwap
{
	int no,temp;
	double count=0,npow,swap,last,first,fpow,mid;

	void setValue(int a)
	{
		no=a;
	}
	int showResult()
	{
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

		fpow=Math.pow(10,(count-1));

	    swap=((last*fpow)+(mid*10)+(first));
	    return (int)swap;

	}
}
public class DigitSwapApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int no;
		System.out.println("Enter the number ");
		no=sc.nextInt();

		DigitSwap d = new DigitSwap();
		d.setValue(no);
		int swap=d.showResult();
		System.out.println("Swap number is : "+swap);
	}
}
