import java.util.*;
class Player                          //create the class for player
{
	private int id;
	private String name;
	private int run;
	private int matches;
	public void setid(int id)
	{
		this.id=id;                 //store the id
	}
	public int getid()
	{
		return id;                 //return the id
	}
	public void setname(String name)
	{
		this.name=name;                //store name
	}
	public String getname()
	{
		return name;                  //return name
	}
	public void setrun(int run)
	{
		this.run=run;               //store id
	}
	public int getrun()
	{
		return run;                 //return run
	}
	public void setmatches(int matches)
	{
		this.matches=matches;         //store matches
	}
	public int getmatches()
	{
		return matches;             //return matches
	}

}
public class TestPlayerApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Player p[] = new Player[5];
		Player temp;
		int i;
		for(i=0;i<p.length;i++)                    //input five players record from user
		{
			p[i]=new Player();
			System.out.println("Enter the Jersyno,name,run and matches for players");
			int jno = sc.nextInt();
			String name = sc.next();
			int run = sc.nextInt();
			int matches = sc.nextInt();

            p[i].setid(jno);
            p[i].setname(name);                      //pass the data from player class using set
            p[i].setrun(run);
            p[i].setmatches(matches);
		}

		System.out.println("\n\nDisplay Record ");               //Display All Player Details
		System.out.println("Jno\tname\trun\tmatches");
		for(i=0;i<p.length;i++)
		{
			System.out.println(p[i].getid()+"\t"+p[i].getname()+"\t"+p[i].getrun()+"\t"+p[i].getmatches());
		}

		System.out.println("\n\nEnter the Specific index from you delete the record ");
		int index = sc.nextInt();

		for(i=0;i<p.length-1;i++)
		{
			if(index==i)
			{
				p[i]=p[i+1];                      //delete the specific index record
			}
		}


		for(i=0;i<p.length-1;i++)                        //Arrange the record Ascending order by matches
		{
			for(int j=i;j<p.length;j++)
			{
				if(p[i].getmatches()>p[j].getmatches())
				{
					temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
		System.out.println("\n\nDisplay Ascending Order  Record ");               //Display record by Ascending order
		System.out.println("Jersyno\tname\trun\tmatches");
		for(i=0;i<p.length-1;i++)
		{
			System.out.println(p[i].getid()+"\t"+p[i].getname()+"\t"+p[i].getrun()+"\t"+p[i].getmatches());
		}
	}
}