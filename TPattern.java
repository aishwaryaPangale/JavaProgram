import java.util.*;
public class TPattern
{
	public static void main(String x[])
	{
		int i,j;
		for(i=1;i<=13;i++)
		{
			for(j=1;j<=13;j++)
			{
				if(i<=7&&j>=8-i&&j<=6+i)
				{
					System.out.print("* ");
				}
				else if(i>=8&&j<=20-i&&j>=i-6)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}

