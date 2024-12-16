import java.util.*;
public class ArrayProduct
{
	public static void main(String x[])
	{
	     Scanner sc = new Scanner(System.in);
	     int a[]=new int[7];
	     int b[]=new int[7];
	     int i,totalprod=1;
	     System.out.println("Enter the element in array ");
	     for(i=0;i<a.length;i++)
	     {
	         a[i]=sc.nextInt();
	     }

	     for(i=1;i<a.length;i++)
	     {
	          totalprod=totalprod*a[i];
	     }
	     for(i=0;i<a.length;i++)
	     {
	         b[i]=totalprod/a[i];
	     }

	     System.out.println("Calcalate the result of ArrayProduct ");
	     for(i=0;i<a.length;i++)
	     {
	         System.out.println(b[i]);
	     }
	}
 }