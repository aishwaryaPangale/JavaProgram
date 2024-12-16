import java.util.*;
public class MedianApp
{
  public static void main(String []args)
  {
      Scanner sc = new Scanner(System.in);
      int m,n,i,k=0,sum=0;
      float mid=0;


      System.out.println("How many element you can add in first array ");
      m=sc.nextInt();
      int a[]=new int[m];
      System.out.println("Enter the element in array ");
      for(i=0;i<a.length;i++)
      {
		  a[i]=sc.nextInt();
	  }

	  System.out.println("How many element you can add in second array ");
	  n=sc.nextInt();
	  int b[]=new int[n];
	  System.out.println("Enter the second array element ");
	  for(i=0;i<b.length;i++)
	  {
		  b[i]=sc.nextInt();
	  }

       int len = m+n;

       int c[]=new int[len];
	  for(i=0;i<a.length;i++)
	  {
		  c[k]=a[i];
		  k++;
	  }
	  for(i=0;i<b.length;i++)
	  {
		  c[k]=b[i];
		  k++;
	  }
	  for(i=0;i<c.length;i++)
	  {
		  for(int j=0;j<c.length;j++)
		  {
			  if(c[i]>c[j])
			  {
				  int temp=c[i];
				  c[i]=c[j];
				  c[j]=temp;
			  }
		  }
	  }
	  for(i=0;i<c.length;i++)      //1 2 3 4 5
	  {
		  sum=sum+c[i];
		  mid=(float)(sum/len);
	  }
	  System.out.println("Median of array : "+mid);
  }
}