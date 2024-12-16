import java.util.*;
public class Reverse
{ 
     public static void main(String x[])
	 { 
	     Scanner xyz = new Scanner(System .in);
		 int no,rev=0,rem;
		 System.out.println("\nEnter the number ");
		 no=xyz.nextInt();
		 
		 while(no!=0)
		 {
		    rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("\nReverse number is :"+rev);
	}
}
		 