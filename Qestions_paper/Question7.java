import java.util.*;
public class Question7
{
	public static void main(String x[])
	{
		for(int i=1;i<=4;i++)
		{   int c=i,t=2;
			for(int j=1;j<=7;j++)
			{
				if(j<=4&&j>=5-i)
				{
					System.out.print(c);
					c--;
				}
				else if(j>=5&&j<=3+i)
				{
					System.out.print(t);
					++t;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}