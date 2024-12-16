import java.util.*;
public class WrapperBoolean
{
	public static void main(String x[])
	{
		String str[] = new String[5];
		Boolean b[] = new Boolean[5];

		Scanner sc= new Scanner(System.in);
		int i;
		System.out.println("Enter the String ");
		for(i=0;i<str.length;i++)
		{
			str[i]=sc.next();
			b[i]=Boolean.parseBoolean(str[i]);
		}

		int count=0;
		for(i=0;i<b.length;i++)
		{
			if(b[i]==true)
			{
				count++;
			}
		}
		System.out.println("Count : "+count);
	}
}