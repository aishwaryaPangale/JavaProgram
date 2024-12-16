import java.util.*;
public class TPattern1
{
	public static void main(String x[])
	{
		int i,j;
		for(i=1;i<=6;i++)
		{
			int count=0;
			for(j=1;j<=13;j++)
			{
					if(j<=i&&j<=6)
					{
					    System.out.print(count++);

					}
					else if(j>=7&&j>=14-i)
					{
						System.out.print(--count);
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

