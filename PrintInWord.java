import java.util.*;
public class PrintInWord
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int no,rem=0,rev=0;
		System.out.println("Enter the number ");
		no=xyz.nextInt();

		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		//System.out.printf("\nReverse is = %d\n",rev);

		while(rev!=0)
		{
			rem=rev%10;
			rev=rev/10;
			if(rem==0)
			    System.out.print("Zero ");
			if(rem==1)
			    System.out.print("one ");

			if(rem==2)
			    System.out.print("two ");

			if(rem==3)
			    System.out.print("three ");

			if(rem==4)
			    System.out.print("four ");


			if(rem==5)
			    System.out.print("five ");

			if(rem==6)
			    System.out.print("six ");

			if(rem==7)
			    System.out.print("seven ");

			if(rem==8)
			    System.out.print("eight ");

			if(rem==9)
			    System.out.print("nine ");
	      }

	      System.out.println("\n");
	  }
  }

