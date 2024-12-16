import java.util.*;
public class Sample
{
	public static void main(String x[])
	{
		System.out.println("ENter the number ");
		Scanner sc =new Scanner(System.in);
		int no = sc.nextInt();

		int count=0,prec=0,nextc=0,i,j;
			for( j=1;j<=no;j++)
			{
				if(no%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("Number is prime ");
			}
			else
			{
				for(i=no;i>1;i--)
				{
					count=0;
					for(j=1;j<=i;j++)
					{
						if(i%j==0)
						{
							count++;
						}
					}
					if(count==2)
					{
						System.out.println("Previous prime "+i);
						break;
					}
				}
				for(i=no;i<no+10;i++)
				{
					count=0;
					for(j=1;j<=i;j++)
					{
						if(i%j==0)
						{
							count++;
						}
					}
					if(count==2)
					{
						System.out.println("Previous prime "+i);
						break;
					}
				}
			}
		}
	}

