import java.util.*;
public class PerfectNumber
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int no,temp,sum=0,i;

		System.out.println("\nEnter the number ");
		no=xyz.nextInt();

		temp=no;

			for(i=1;i<no;i++)
			{
				if(no%i==0)
				{
					sum=sum+i;

				}
			}


			if(sum==temp)
			{
				System.out.println("\nNumber is Perfect ");
			}
			else
			{
				System.out.println("\nNumber is not Perfect ");
			}
		}
	}
