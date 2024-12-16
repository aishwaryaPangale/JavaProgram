import java.util.*;
public class WrapperComparision
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two string number ");
		String str = sc.next();
		String str1 = sc.next();

		Integer a = Integer.valueOf(str);
		Integer b = Integer.valueOf(str1);

		String result = a>b?"A is Greater than B ":a==b?"A or B is Equal ":"A is less than B ";

		System.out.println(result);
	}
}