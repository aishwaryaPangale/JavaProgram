import java.util.*;
public class SubArray
{
   public static void main(String x[])
  {
    int i,j;
    int a[]=new int[10];
    Scanner xyz=new Scanner(System.in);
    System.out.println("enetr the array elemnt");
    for(i=0;i<a.length;i++)
    {
      a[i]=xyz.nextInt();
    }

     int max=0;
     int k=4,m=0;
    for(i=0;i<a.length;i++)
    {
		m=i;
        max=a[i];
       if(i<=a.length-4)
       {
          for(j=m;j<k;j++)
			{
				System.out.print(" "+a[j]);
                if(max<a[j])
                {
					max=a[j];
				}


			}
			System.out.print("-----"+max);
			 k++;
		System.out.println();
	   }
	 }

   }
 }
