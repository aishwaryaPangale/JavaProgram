import java.util.*;
public class PracticeTabel
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int a = sc.nextInt();

         System.out.println("Tabel of "+a);
		for(int i=1;i<=10;i++)
		{
			System.out.println(a*i);
		}
	}
}