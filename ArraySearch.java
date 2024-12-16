import java.util.*;
public class ArraySearch
{
	public static void main(String args[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[],i,no;
		a=new int[5];
		System.out.println("\nEnter the element in array ");
		for(i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("\nDisplay Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		System.out.println("\nEnter the number you searched ");
		no=xyz.nextInt();
		int flag=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==no)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.printf("\n%d number is found ",no);
		}
		else
		{
			System.out.printf("\n%d is not found ",no);
		}
			
	}
}
	