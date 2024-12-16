import java.util.*;
public class Question6
{
	public static void main(String x[])
	{
		ArrayList <Integer>al =new ArrayList<Integer>();
		al.add(121);
		al.add(123);
		al.add(454);
		al.add(515);
		al.add(145);
		al.add(987);
		for(Integer val :al)
		{
			int temp=val;
			while(val!=0)
			{
				int rem=val%10;
				int rev=rev*10+rem;
				val=val/10;
			}
			if(rev==temp)
			{
				System.out.print(rev+" ");
			}
		}
	}
}