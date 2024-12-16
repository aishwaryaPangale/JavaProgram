import java.util.*;
public class CheckSD
{
    public static void main(String x[])
	{
	    Scanner abc = new Scanner(System .in);
		char ch;
		System.out.println("\nEnter the Character ");
		ch=abc.next().charAt(0);
		
		String result=(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')?"Character is Alphabet ":(ch>='0'&&ch<='9')?"Character is Digits ":"Character is Special Symbol ";
	    System.out.println(result);
	}
}