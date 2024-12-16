import java.util.*;
public class PracticeReverseNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int no = sc.nextInt();

		int rem,rev=0,temp;
		temp=no;
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(" Reverse number = "+rev);
		if(temp==rev)
		{
			System.out.println("  Palindrome number ");
		}
		else
		{
			System.out.println("  Not Palindrome number ");
		}

	}
}