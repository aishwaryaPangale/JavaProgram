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
		int temp,rem,rev=0;
		for(Integer val:al)
		{
			//System.out.print(val+"\t");
			 temp=val;
			while(val!=0)
			{
				 rem=val%10;
				 rev=rev*10+rem;
				val=val/10;
			}
			if(rev==temp)
			{
				System.out.print(rev+" ");
			}
			rev=0;
		}
	}
}