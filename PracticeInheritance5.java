import java.util.*;
class ArrParent
{
	int a[];
	void setValue(int a[])
	{
		this.a=a;
	}
	void arrangeSeq()
	{
	}
}
class ArrayAscending extends ArrParent
{
	 void arrangeSeq()
	 {
		 int i,j,temp;
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
		 System.out.println("Display Ascending Array ");
		 for(i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+"\t");
	     }
	 }
}
class ArrayReverse extends ArrParent
{
	void arrangeSeq()
	{
		int i,j,temp;
		for(i=0,j=a.length-1;i<a.length/2;i++,j--)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("Array In Reverse ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
}
public class PracticeInheritance5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] =new int[5];
		int i;
		System.out.println("Enter the Array elements ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		ArrayAscending aa = new ArrayAscending();
		aa.setValue(a);
		aa.arrangeSeq();

		ArrayReverse ar = new ArrayReverse();
		ar.setValue(a);
		ar.arrangeSeq();
	}
}


