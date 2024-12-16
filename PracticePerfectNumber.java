import java.util.*;
public class PracticePerfectNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int no = sc.nextInt();

		int temp,sum=0,i;
        temp=no;
		for(i=1;i<no;i++)
		{
			int f=1;
			if(no%i==0)
			{
				sum=sum+i;
			}

		}
        if(sum==no)
        {
			System.out.println("Number is a Perfect Number ");
		}
		else
		{
			System.out.println("Number is not a perfect number ");
		}
	}
}