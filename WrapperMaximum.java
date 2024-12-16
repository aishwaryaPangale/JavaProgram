import java.util.*;
public class WrapperMaximum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three String ");
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		int m = Integer.parseInt(a);
		int n = Integer.parseInt(b);
		int o = Integer.parseInt(c);

		if(m>n && m>o)
		{
			System.out.println("Maximum = "+m);
		}
		else if (n>o)
		{
			System.out.println("Maximum = "+n);
		}
		else
		{
			System.out.println("Maximum = "+o);
		}
	}
}