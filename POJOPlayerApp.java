import java.util.*;
class Player
{
	int id;
	String name;
	void setid(int id)
	{
		this.id=id;
	}
	int getid()
	{
		return id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getname()

		return name;
	}

}
public class POJOPlayerApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int id;
		String name;

		System.out.println("Enter id and name ");
		id=sc.nextInt();
		name=sc.nextLine();

		Player p = new Player();
		p.setid(id);
		p.setName(name);

		System.out.println(p.getid()+"\t"+p.getname());2
	}
}