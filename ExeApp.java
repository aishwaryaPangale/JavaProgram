import java.util.*;

public class ExeApp
{
	static int ad[];
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1) ArithmeticException \n2) StringIndexOutOfBoundException \n3) ArrayIndexOfBound \n4) NullPointer");
		System.out.println("5) NumberFormatException \n6) InputMistchMathExp \n7) ClassNotFound");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();


		switch(choice)
		{
		  case 1: System.out.println("Enter the two number ");
					int a=sc.nextInt();
					int b = sc.nextInt();
					int c;

					try
					{
					  c=a/b;
					  System.out.println("Division : "+c);
					 }
				  catch(ArithmeticException ex)
				  {
						System.out.println("Second value can't be gives zero");
						System.out.println("Error is "+ex);
				   }
				   break;
		  case 2: System.out.println("Enter the String ");
		           String str = sc.next();

                   try
                   {
		           		System.out.println(str.charAt(str.length()+2));
					}
					catch(Exception ex)
					{
						System.out.println("Something went wrong try to print perfect string");
						System.out.println("Erro is : "+ex);
					}

		           break;
		  case 3 : System.out.println("Enter the Array Element");
		  			int arr[] = new int[3];
		  			int i;
		           for( i=0;i<arr.length;i++)
		           {
					   arr[i]=sc.nextInt();
				   }
				   try{
					   System.out.println(arr[3+1]+"\t");
				   }
				   catch(Exception ex)
				   {
					   System.out.println("Something went wrong ");
					   System.out.println("Error is :"+ex);

				   }
				   break;
		  case 4 :
		           try
		           {  ad[0]=100;
					   System.out.println(ad[0]);
				   }
				   catch(NullPointerException ex)
				   {
					   System.out.println("Error is : "+ex);
				   }
			       break;
		  case 5 :
		             try
		             {
						 String s="123 ";
						 int j = Integer.parseInt(s);
						  System.out.println(j);
					  }
					  catch(NumberFormatException ex)
					  {
						  System.out.println("Error is :"+ex);
					  }
			         break;
		 case 6 :
		            int m;
					System.out.println("Enter number ");
					m=sc.nextInt();
		            try
					{
						System.out.println(m);
					}
			        catch(Exception ex)
			        {
						System.out.println("Error is "+ex);
					    System.out.println("Enter the perfect number ");
					}
		            break;
		  case 7:
		          try{
					  Class.forName("com.mysql.cj.jdbc.Driver");
				  }
				  catch(Exception e)
				  {
					  System.out.println("Error :"+e);
				  }
				  break;
mysql.cj.jdbc.
		}
	}
}

