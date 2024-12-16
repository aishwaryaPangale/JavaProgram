import java.util.*;
public class ArrayNextBigElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[7];
		int b[]=new int[7];
		int i,j;
		System.out.println("\nEnter the elment in array ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("\nDisplay Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}


        for(i=0;i<a.length;i++)
        {
			if(i==a.length-1)
	        {
				System.out.println("next Greater element of "+a[i]+"is "+"-1");
				b[i]= -1;
		    }
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					b[i]=a[j];
                     System.out.println("next Greater element of "+a[i]+"is "+b[i]);
                     break;
				}


			}
		}

      System.out.println("\nNext Greater element ");
      for(i=0;i<b.length;i++)
      {

				System.out.print("\t"+b[i]);

	  }
	  System.out.print("\n\n");
	}
}
