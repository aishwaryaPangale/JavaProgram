import java.util.*;
public class WrapperReverseNo
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.next();

		int no = Integer.parseInt(str);

		int temp=no;
		int rem=0,rev=0;

		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(temp==rev)
		{
			System.out.println("Number is Reverse ");
		}
		else
		{
			System.out.println("Number is not Reverse ");
		}
	}
}
