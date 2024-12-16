import java.util.*;
import java.io.*;
public class GetDriveApp
{
	public static void main(String args[])
	{
		/*File f[] = File.listRoots();

		for(int i=0;i<f.length;i++)
		{
			long totalSpace = f[i].getTotalSpace();
	        long freeSpace = f[i].getFreeSpace();
	        System.out.println(f[i]+"\nTotal Space :"+(totalSpace/1073741824)+"GB"+"\n Free Space :"+(freeSpace/1073741824)+"GB");
	        System.out.println("Using Space :"+((totalSpace-freeSpace)/1073741824)+"GB");
	    }*/

	    File f = new File("C:\\UIProject");

	    File list[] = f.listFiles();

	    for(int i=0;i<list.length;i++)
	    {
			/*if(list[i].isFile())
			{
			System.out.println(list[i]);
		   }*/

		   if(list[i].isDirectory())
		   	{
		   	   System.out.println(list[i]);
		   }
		}


		File f=new File("C:\\aishwarya\\employee.doc");
		/*boolean b = f.mkdir();


		if(b)
		{
		  System.out.println("Folder is created ");
		}
		else
		{
			System.out.println("Some proble is there....");
		}*/

		boolean b = f.exists();
		if(b)
		{
			System.out.println("Folder alredy exists ");
		}
		else
		{
			boolean check = f.mkdir();
			if(check)
			{
				System.out.println("Folder is created ");
			}
			else
			{
				System.out.println("Some problem is there.....");
			}
		}
	}
}