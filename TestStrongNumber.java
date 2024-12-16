import java.util.*;
public class TestStrongNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of strong number ");    //Input from the user
		int limit = sc.nextInt();

		int i,j,rem,f,temp,sum;
		for(i=1;i<=limit;i++)
		{
			temp=i;
			sum=0;                 //Intialize sum is 0
			while(temp!=0)
			{
				rem=temp%10;           //calaculate the remaider
				f=1;                  //Intialize f is 1
				for(j=1;j<=rem;j++)
				{
					f=f*j;            //Calculate the factors of one by one number
				}
				sum=sum+f;
				temp=temp/10;
			}
			if(sum==i)                //check sum euqual to i means number
			{
				System.out.print(i+"\t");
			}
		}
	}
}