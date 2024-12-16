/*import java.util.Scanner;

public class StringApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.next();

        char ch[] = str.toCharArray();
        int num = 0, sum = 0;

        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i] >= '0' && ch[i] <= '9')
            {  // Check if the character is a digit
                num = num * 10 + (ch[i] - '0');   // Convert char to integer and build the number
            } else
            {
                sum += num;   // Add the current number to the sum
                num = 0;      // Reset num for the next potential number
            }
        }

        sum += num;  // Add the last accumulated number, if any

        System.out.println("Sum = " + sum);
    }
}
*/

import java.util.*;
public class StringApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.next();

		char ch[] = str.toCharArray();
		int num=0,sum=0;

		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48&&ch[i]<=57)
			{
				num=num*10+ch[i]-48;
			}
			else
			{
				sum=sum+num;
				num=0;
			}
		}
		sum=sum+num;
		System.out.println(sum);


		/*char temp;
		int i,j;
		for(i=0,j=ch.length-1;i<ch.length/2;i++,j--)
		{
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		System.out.println(String.valueOf(ch));*/
	}
}