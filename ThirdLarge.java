import java.util.*;
public class ThirdLarge
{
	public static void main(String x[])
		{
			Scanner sc=new Scanner(System.in);
			int a[]=new int[5];
			int i,j,temp,sec,max,k=0;

			System.out.println("\nEnter the element in array ");
			for(i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}

			System.out.println("\nDispaly Array ");
			for(i=0;i<a.length;i++)
			{
				System.out.println("\t"+a[i]);
			}

			//Sorting logic
			for(i=0;i<a.length;i++)
			{
				for(j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("\nSorted Array ");
			for(i=0;i<a.length;i++)
			{
				System.out.println("\t"+a[i]);
			}
			max=0 ;
			int smax=a[0], tmax=0;
			 for(i=0;i<a.length;i++)
			  {
			    if(a[i]>max)
			      {
					tmax=smax;
			           smax=max;
			           max=a[i];
					}
			        else if(a[i]>smax&&a[i]!=max)
			        {
			            smax=max;
			            max=a[i];
			        }
			       else if(a[i]>tmax&&a[i]<smax)
			        {
			             tmax=a[i];
			        }
				}

				System.out.println("Maximum = "+max);
				System.out.println("second max = "+smax);
				System.out.println("Third max = "+tmax);
			}
    }