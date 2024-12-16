import java.util.*;
import java.io.*;
public class Question3
{
	public static void main(String x[])throws Exception
	{
		 FileWriter fw1 = new  FileWriter("D:\\Demo\\word.txt",true);
		BufferedWriter bw1 = new BufferedWriter(fw1);

		 FileWriter fw2 = new  FileWriter("D:\\Demo\\digit.txt",true);
		BufferedWriter bw2 = new BufferedWriter(fw2);

		 FileWriter fw3 = new  FileWriter("D:\\Demo\\specialSymbol.txt",true);
		BufferedWriter bw3 = new BufferedWriter(fw3);

		FileReader fr = new FileReader("D:\\Demo\\java.txt");
		BufferedReader br = new BufferedReader(fr);
         String data;

         while((data=br.readLine())!=null)
         {
			 for(int i=0;i<data.length();i++)
			 {
				 char ch = data.charAt(i);
			 //System.out.println(data);
			 if(ch>='0'&&ch<='9')
			 {
				 bw2.write(ch);
				 System.out.println("Data Write Successfully ");
			 }
			 else if((ch>='a'&&ch<='z')&&(ch>='A'&&ch<='Z'))
			 {
				 bw1.write(ch);
				 System.out.println("Data Write Successfully ");
			 }
			 else
			 {
				 bw3.write(ch);
				 System.out.println("Data Write Successfully ");
			 }
		   }
		 }

	 }
 }

