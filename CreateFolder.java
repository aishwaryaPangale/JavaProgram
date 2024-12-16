import java.io.*;
import java.util.*;
public class CreateFolder
{
	public static void main(String args[])throws Exception
	{
        FileWriter fw=new FileWriter("C:\\aishwarya\\abc.txt",true);
        BufferedWriter bw =new BufferedWriter(fw);
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter data ");
        String data = sc.nextLine();

        bw.write(data);
        bw.newLine();
        bw.close();

        System.out.println("Data save Success ");
        fw.close();

      /*  FileReader fr = new FileReader("C:\\aishwarya\\demofile.txt");
        int data;

        while((data=fr.read())!=-1)
        {
			System.out.print((char)data);
		}
		System.out.print(data);
		System.out.println();*/
	}
}