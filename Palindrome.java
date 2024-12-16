import java.util.*;
public class Palindrome
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		int no,rev=0,temp,rem;
		System.out.println("\nEnter the number ");
         no=sc.nextInt();

         temp=no;
         while(no!=0)
         {
			 rem=no%10;
			 rev=rev*10+rem;
			 no=no/10;
		}
		if(temp==rev)
		{
			System.out.println("\nNumber is Palindrome ");
		}
		else
		{
			System.out.println("\nNumber is not Palindrome ");
		}
	}
}
