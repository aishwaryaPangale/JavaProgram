import java.util.*;

public class TestIsogramArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		 int i,j;
		 System.out.println("Enter the Array elements ");
		 for(i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();               //input Array from user
		 }

		 boolean f = false;                    //initialize f is false
		 for(i=0;i<a.length;i++)
		 {
			 for(j=i+1;j<a.length;j++)
			 {
				 if(a[i]==a[j])                   //check Array first number or second number is equal or not
				 {
					 f=true;                     //if equal the f becomes true
				 }
			 }
		 }
		 if(f==false)                                //check f is false then say Array is Isogram
		 {
			 System.out.println("Array is Isogram Array ");
		 }
		 else
		 {
			 System.out.println("Array is not Isogram Array ");
		 }


	}
}