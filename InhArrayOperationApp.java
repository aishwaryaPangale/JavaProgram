import java.util.*;
interface ArrayOperation
{
	void performOperation(int a[]);
}
class Sorting implements ArrayOperation
{
	public void performOperation(int a[])
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
		System.out.println("Display Array in Asending Order ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
}
class Insertion implements ArrayOperation
{
	int i,no,ind;
	void setValue(int value,int index)
	{
		no=value;
		ind=index;
	}
	public void performOperation(int a[])
	{
		for(i=a.length-1;i>ind;i--)
		{
			a[i]=a[i-1];
	     }
	     a[ind]=no;

	     System.out.println("Display insert value in Array ");
	     for(i=0;i<a.length;i++)
	     {
			 System.out.print(a[i]+"\t");
		 }
	 }
 }
 class Deletion implements ArrayOperation
 {
	 int i,j,ind;
	 void setIndex(int index)
	 {
		 ind=index;
	 }
	 public void performOperation(int a[])
	 {
		 for(i=0;i<a.length;i++)
		 {
			 if(i==ind)
			 {
				 for(j=i;j<a.length-1;j++)
				 {
					 a[j]=a[j+1];
				 }
			 }
		 }
		 System.out.println("Display Array ");
		 for(i=0;i<a.length-1;i++)
		 {
			 System.out.print(a[i]+"\t");
		 }
	 }
 }
class Rev implements ArrayOperation
{
	public void performOperation(int a[])
	{
		int i,j,temp;
		for(i=0,j=a.length;i<a.length/2;i++,j--)
		{
			 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }
		 System.out.println("Display Array in Reverse ");
		 for(i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+"\t");
		 }
	 }
 }
 public class InhArrayOperationApp
 {
	 public static void main(String x[])
	 {
		 Scanner sc = new Scanner(System.in);
		 int a[] = new int[5];
		 System.out.println("Enter the Array elements ");
		 int i;
		 for(i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();
		 }

		 System.out.println("1) sorting 2) Insertion 3) Deletion 4) Reverse");
		 System.out.println("Enter the number");
		 int choice=sc.nextInt();

		 switch(choice)
		 {
			 case 1: Sorting s=new Sorting();
			         s.performOperation(a);
			         break;

			 case 2: Insertion t=new Insertion();
			         System.out.println("ENter the no and index");
					  int no=sc.nextInt();
					  int ind=sc.nextInt();
			          t.setValue(no,ind);
			           t.performOperation(a);

			         break;
			  case 3: Deletion d=new Deletion();
			          System.out.println("ENter the index");
			          int index=sc.nextInt();
	                  d.setIndex(index);
			          d.performOperation(a);
			          break;
			  case 4: Rev r=new Rev();
			          r.performOperation(a);
			           break;
	   }
   }
}






