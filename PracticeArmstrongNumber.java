import java.util.*;
public class PracticeArmstrongNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int no = sc.nextInt();

		int temp=no;
		int rem,p,i,sum,count=0;
		while(no!=0)
		{
			no=no/10;
			++count;

		}

	     no=temp;
	     sum=0;
	     while(no!=0)
	     {
			 rem=no%10;
			 p=1;
			 for(i=1;i<=count;i++)
			 {
				 p=p*rem;
			 }
			 sum=sum+p;
			 no=no/10;
		 }
		 if(temp==sum)
		 {
			 System.out.println("Number is Armstrong number ");
		 }
		 else
		 {
			 System.out.println("Number is not Armstrong ");
		 }
	 }
 }

