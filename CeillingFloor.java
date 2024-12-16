import java.util.*;
public class CeillingFloor
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		int i,no,ceilling=0,floor=0,temp,j;

		System.out.println("\nEnter element in array ");
		for(i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}

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

		System.out.println("\nDisplay record");
		for(i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}

		System.out.println("\nEnter the number ");
		no=xyz.nextInt();

		for(i=0;i<a.length;i++)
		{
					if(no<a[0])
					{
						ceilling=a[0];
						floor=-1;
						break;
					}
					else if(no>a[a.length-1])
					{
						ceilling=-1;
						floor=a[a.length-1];
						break;
					}
					else if(a[i]==no)
					{
						ceilling=a[i];
						floor=a[i];
						break;
					}
					else if(a[i]<no&&a[i+1]>no)
					{
						ceilling=a[i+1];
						floor=a[i];
						break;
					}
		}

		System.out.printf("\nCeilling = %d\tFloor = %d\n",ceilling,floor);
	}
}
