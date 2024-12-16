import java.util.*;
public class WrapperSumBoolean
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a=0,b=0;
		System.out.println("Enter two string ");
		String str = sc.next();
		String str1 = sc.next();

		Boolean x1 = Boolean.parseBoolean(str);
		Boolean y = Boolean.parseBoolean(str1);

		if(x1==true&&y==true)
		{
			a=1;
			b=1;
		}
		else if(x1==false&&y==true)
		{
			a=0;
			b=1;
		}
		else if(x1==true&&y==false)
		{
			a=1;
			b=0;
		}
		System.out.println("Sum : " +(a+b));
	}
}



