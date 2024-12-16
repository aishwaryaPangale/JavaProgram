import java.util.*;
public class ArmstrongNumber
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int no,rem,count,temp,p;

		System.out.println("Enter the number");
		no=xyz.nextInt();

		temp=no;
		count=0;
		while(no!=0)							 //153
		{
			no=no/10;							 //3 5 1
			count++;
										//3
		}
		System.out.println("count="+count);

		no=temp;								//no=153
		int sum=0;
		while(no!=0)
		{
			rem=no%10; 							//3 5 1
			p=1;
			for(int i=1;i<=count;i++)
			{
				p=p*rem;						 //27 125 1
			}
			 sum= sum+p;					//27+125+1 =  153
			no=no/10; 						//15 1
		}
		if(sum==temp)
		{
			System.out.println("\nNumber is Armstrong number ");
		}
		else
		{
			System.out.println("\nNumber is not Armstrong number");
		}
	}
}
