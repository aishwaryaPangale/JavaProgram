import java.util.*;
public class CheckDigit
{
	public static void main(String arg[])
	{
		Scanner xyz= new Scanner(System .in);
		int no;
		System.out.println("\nEnter the number ");
		no=xyz.nextInt();

String result=(no==0)?"Digits is Zero ":(no>0)?"Digits is positive ":"Digits is negative ";
		System.out.println(result);
	}
}