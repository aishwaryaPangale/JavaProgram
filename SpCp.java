import java.util.*;
public class SpCp
{
   public static void main(String arg[])
   {
      Scanner xyz = new Scanner(System .in);
	  int sp,cp;
	  System.out.println("Enter the Selling price and Cost price ");
	  sp=xyz.nextInt();
	  cp=xyz.nextInt();
	  
	  String result=(sp>cp)?"Profit ":"Loss ";
	  System.out.println(result);
	}
}