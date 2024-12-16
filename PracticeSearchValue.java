import java.util.*;
public class PracticeSearchValue
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a [] =new int[5];
		int i,skey,index=-1;
		System.out.println("Enter the Array element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Display Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}

		System.out.println("Enter the Search key Value ");
		skey=sc.nextInt();

        boolean f = false;
		for(i=0;i<a.length;i++)
		{
			if(skey==a[i])
			{
				index=i;
				f=true;
				break;
			}
		}
		if(f==true)
		{
			System.out.println("Index = "+index);
		}
		else
		{
			System.out.println("Index = "+index);
		}

	}
}