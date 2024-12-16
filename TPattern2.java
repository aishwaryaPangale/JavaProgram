import java.util.*;
public class TPattern2
{
	public static void main(String args[])
	{
		int i,j,k=0;
		for(i=1;i<=5;i++)
		{
			boolean b=true;
			for(j=1;j<=9;j++)
			{
				if(j>=6-i&&j<=4+i)
				{
					if(b)
					{
						k=6-j;
						b=false;
					}
					if(j<=5)
					   System.out.print(6-j);
					else
					    System.out.print(k--);
			    }
			    else
			       System.out.print(" ");
			   }
			   System.out.println();
		   }

	}
}