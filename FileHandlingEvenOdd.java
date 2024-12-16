import java.util.*;
import java.io.*;
public class FileHandlingEvenOdd
{
	public static void main(String x[])throws Exception
	{
		Scanner sc = new Scanner(System.in);

		FileReader fr = new FileReader("C:\\aishwarya\\abc.txt");
		FileWriter ev = new FileWriter("C:\\aishwarya\\even.txt");
		BufferedWriter bw = new BufferedWriter(ev);

		FileWriter od = new FileWriter("C:\\aishwarya\\odd.txt");
		BufferedWriter bo = new BufferedWriter(od);

		FileWriter pm = new FileWriter("C:\\aishwarya\\prime.txt");
		BufferedWriter bp = new BufferedWriter(pm);

		StringBuffer sb = new StringBuffer();
		int data;

		while((data=fr.read())!=-1)
		{
			sb.append((char)data);
		}
		System.out.println("111 "+sb);
		bw.write("Even Number ");
		bo.write("Odd Number ");
		bp.write("Prime Number ");

		int num=0;
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)>='0'&&sb.charAt(i)<='9')
			{
				num=num*10+(sb.charAt(i)-48);
			}
			else
			{
				if(num!=0)
				{
					if(num%2==0)
					{
						System.out.println("Number is Even "+num);
						bw.newLine();
						bw.write(String.valueOf(" "+num));
					}
					if(num%2!=0)
					{
						System.out.println("Number is odd "+num);
						bo.newLine();
						bo.write(String.valueOf(" "+num));
					}
					if(num!=0)
					{
						int count=0;
						for(int k=1;k<=num;k++)
						{
							if(num%k==0)
							{
								count++;
							}
						}
							if(count==2)
							{
								System.out.println("Number is prime "+num);
								bp.newLine();
								bp.write(String.valueOf(" "+num));
							}
						}
					}

				num=0;
			}
		}

					ev.close();
					od.close();
					pm.close();
					bw.close();
					bo.close();
					bp.close();

	}
}

