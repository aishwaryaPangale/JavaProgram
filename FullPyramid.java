import java.util.*;
public class FullPyramid
{
	public static void main(String args[])
	{
		int i,j,flag=1;
		for(i=1;i<=6;i++)
		{
			for(j=1;j<=11;j++)
			{
				if(j<=5+i && j>=7-i && flag!=0)
				{
				  System.out.print("* ");
			    }
			    else
			    {
					System.out.print("  ");
					flag=1;
				}
			}
			System.out.println();
		}
	}
}