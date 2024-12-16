import java.util.*;

public class Check
{
  void abcd()
  {
	   System.out.println("hello");
	  }

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
	//System.out.println("1) String of capacity ");
   new Check().abcd();

		System.out.println("Esnter the string ");
		String str = sc.next();

        StringBuffer sb = new StringBuffer();

		System.out.println("Capacity of string :"+sb.capacity());
	}
}
