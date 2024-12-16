import java.util.*;
public class WrapperEvenOdd
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.next();

		int no = Integer.parseInt(str);

		if(no%2==0)
		{
			System.out.println("Even ");
		}
		else
		{
			System.out.println("Odd ");
		}
	}
}