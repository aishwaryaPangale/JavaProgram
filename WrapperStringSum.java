import java.util.*;
public class WrapperStringSum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		String str = sc.next();

          int a=0;


         try{
			  a=Integer.parseInt(str);
			 System.out.println("String is "+a);
		 }
		 catch(Exception e)
		 {
			 System.out.println("Enter in number from ");
			 System.out.println("Error is :"+e);
		 }
		int rem=0,sum=0;
		while(a!=0)
		{
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		System.out.println("Sum of Digits :"+sum);
	}
}