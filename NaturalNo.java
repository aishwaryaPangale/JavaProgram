import java.util.*;
public class NaturalNo
{
	public static void main(String args[])
	{
		Scanner xyz = new Scanner(System.in);
		int no,i;
		System.out.println("\nEnter the number ");
		no=xyz.nextInt();
		
		for(i=0;i<=no;i++)
		{
			System.out.printf("%d\n",i);
		}
		i--;
		while(i>=0)
		{
			System.out.printf("\n%d",i);
			i--;
		}
	}
}
	