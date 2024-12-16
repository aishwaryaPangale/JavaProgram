import java.util.*;
public class StrongNumber
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int no,i,f,rem,temp,sum;

		System.out.println("\nEnter the number ");
		no=xyz.nextInt();

		temp=no;     				//145
		sum=0;
		while(no!=0)                //145
		{
			rem=no%10;				//5  4
			f=1;
			for(i=1;i<=rem;i++)
			{
				f=f*i;				//120  24 1
			}
			sum=sum+f;
			no=no/10;                //14
		}
		if(sum==temp)
		{
			System.out.println("\nNumber is strong number ");
		}
		else
		{
			System.out.println("\nNumber is not strong number ");
		}
	}
}
