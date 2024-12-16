import java.util.*;
public class Fact
{
    public static void main(String x[])
	{
		Scanner xyz = new Scanner (System .in);
		int f,i,no;
		System.out.println("\nEnter the number ");
	    no=xyz.nextInt();
		f=1;
		for(i=1;i<=no;i++)
		{
			f=f*i;
		}
		System.out.println("\nFactor is :"+f);
	}
}