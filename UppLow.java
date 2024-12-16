import java.util.*;
public class UppLow
{
  public static void main(String x[])
  {
     Scanner xyz = new Scanner(System .in);
	 char ch;
	 System.out.println("\nEnter the character ");
	 ch=xyz.next().charAt(0);
	 
	 String result=(ch>='A'&&ch<='Z')?"Character is UpperCase ":"Character is LowerCase ";
	 System.out.println(result);
  }
}