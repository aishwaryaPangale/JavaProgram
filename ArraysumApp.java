import java.util.*;
class sum
{
	int arr[];
    int i;
	void setArray(int a[])
	{
		arr=a;
	}
	void showSum()
	{
		int sum=0;
		for(i=0;i<5;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum = "+sum);
	}

}
public class ArraysumApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		int i;

		System.out.println("Enter the element in array ");
		for( i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}


		sum s = new sum();
		s.setArray(a);
		s.showSum();
	}
}

