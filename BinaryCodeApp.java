import java.util.*;
public class BinaryCodeApp
{
	public static void main(String x[])
	{

		Scanner sc = new Scanner(System.in);
		char ch[]=new char[10];
		int sum=0;
		System.out.println("Enter the String");
		String str = sc.nextLine();
		char ch = str.toCharArray(10);

		for(int i=0;i<ch.length;i++)
		{
			if(ch>='0'&&ch<='9')
			{
				sum=sum+ch;
			}
		}
		System.out.println("Sum of Digit is :"+sum);
	}
}
