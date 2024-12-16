import java.util.*;
public class TestMissingElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];

		int i,j,min=0;
		System.out.println("Enter the Array Elements ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}


		System.out.println("Missing Elements int array ");
		for(i=0;i<a.length-1;i++)
		{

				for(j=a[i];j<a[i+1]-1;)
				{
					System.out.print((++j)+"\t");


				}

		}
		for(i=0,j=1+i;i<a.length-1;i++,j++)
		{
			if(a[j]-a[i]>1)
			{
				System.out.println("\nSmallest Missing Elements : "+(a[i]+1));
				break;
			}
		}


	}
}

