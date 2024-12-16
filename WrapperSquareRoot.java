import java.util.*;
public class WrapperSquareRoot
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String number ");
		String str = sc.next();

		Double no = Double.parseDouble(str);

         System.out.println("Square Root  :"+Math.sqrt(no));
	}
}