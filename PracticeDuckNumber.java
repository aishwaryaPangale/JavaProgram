import java.util.*;
public class PracticeDuckNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int no = sc.nextInt();

		int rem;
		boolean f=false;
		while(no!=0)
		{
			rem=no%10;
			if(rem==0)
			{
				f=true;
			}
			no=no/10;
		}
		if(f==true)
		{
			System.out.println("Number is Duck ");
		}
		else
		{
			System.out.println("Number is not Duck ");
		}
	}
}