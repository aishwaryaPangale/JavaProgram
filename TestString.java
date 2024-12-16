import java.util.*;
public class TestString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.next();
		char ch[] = str.toCharArray();

		int i;
		System.out.println("Enter the character ");
		char schar = sc.next().charAt(0);
		int celling=0;
		int floor=0;
		for(i=0;i<ch.length;i++)
		{
			if(schar<ch[0])
			{
               celling=((char)ch[0]);
               floor=-1;
               break;
		   }
		   else if(schar>ch[ch.length-1])
		   {
			   celling=-1;
			   floor=((char)ch[ch.length-1]);
			   break;
		   }
		   else if(ch[i]<schar&&ch[i+1]>schar)
		   {
			   celling=((char)ch[i+1]);
			   floor=((char)ch[i]);
			   break;
		   }
	   }
	   System.out.println("\nCelling : "+celling+"\nFloor :"+floor);
   }
}