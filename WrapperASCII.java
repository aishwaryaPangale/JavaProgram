import java.util.*;
public class WrapperASCII
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.next();

		char ch =str.charAt(0);
		System.out.println("ASCII Value of Character :"+(int)ch);

	}
}