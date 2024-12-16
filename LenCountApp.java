import java.util.*;
class LenCount
{
	char ch[];
	int i,len=0;
	LenCount(char c[])
	{
		ch=c;
	}
	int getLength()
	{
		for(i=0;i<ch.length;i++)
		{
			len++;
		}
		return len;
	}
}
public class LenCountApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.next();
		char ch[] = str.toCharArray();

		LenCount l = new LenCount(ch);
		int count = l.getLength();
		System.out.println("Length of String is :"+count);
	}
}