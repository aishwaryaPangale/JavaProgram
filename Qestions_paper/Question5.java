import java.util.*;
import java.io.*;
/*-----------Seialization-----------------*/
class AccountInfo implements Serializable
{
	private String uname;
	private int pass;
	private String type;
	public void setUname(String uname)
	{
		this.uname=uname;
	}
	public String getUname()
	{
		return uname;
	}
	public void setPass(int pass)
	{
		this.pass=pass;
	}
	public int getPass()
	{
		return pass;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return type;
	}
}

/*public class Question5
{
	public static void main(String x[])throws Exception
	{
		FileOutputStream fout = new FileOutputStream("D:\\Demo\\java.txt");
		ObjectOutputStream  oout = new ObjectOutputStream(fout);
		AccountInfo ai = new AccountInfo();
		ai.setUname("Aish");
		ai.setPass(1234);
		ai.setType("Saving");
		oout.writeObject(ai);
		oout.close();
		System.out.println("Success........");
	}
}*/
/*-----------Deseialization-----------------*/
public class Question5
{
	public  static void main(String x[])throws Exception
	{
		FileInputStream fin = new  FileInputStream("D:\\Demo\\java.txt");
		ObjectInputStream ion = new ObjectInputStream(fin);

		AccountInfo ai = (AccountInfo)ion.readObject();
		System.out.println(ai.getUname()+"\t"+ai.getPass()+"\t"+ai.getType());
		System.out.println("Success.......");
	}

}

