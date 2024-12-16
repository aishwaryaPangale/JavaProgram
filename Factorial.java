import java.util.*;
public class Factorial
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int no,i,f=1;

		System.out.println("\nENter the number ");
		no=xyz.nextInt();

		for(i=1;i<=no;i++)
		{
			f=f*i;
			System.out.printf("\nFactorial is : %d",i);
		}
		System.out.printf("\nFactorial is :%d\n",f);
	}
}

