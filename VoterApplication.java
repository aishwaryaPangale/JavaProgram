import java.util.*;
class Ward
{
	private int wid;
	private String wname;
	private Voter voter[];
	public void setid(int wid)
	{
		this.wid=wid;
	}
	public int getid()
	{
		return wid;
	}
	public void setname(String wname)
	{
		this.wname=wname;
	}
	public String getname()
	{
		return wname;
	}
    public void setvoter(Voter ...voter)
	{
	    this.voter=voter;
	}
	public Voter[] getvoter()
	{
		return voter;

	}
}
class Voter
{
	private int id;
	private int age;
	private String name;
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public int getage()
	{
		return age;
	}

}
class VottingMachine
{
	private Ward w[];
	private Voter voter[];
	int a[]=new int[5];
	int count=0,k=0;
		int count1=0;
	public void setWards(Ward ...w)
	{

		 for(int i=0;i<w.length;i++)
		  {

            System.out.println("Ward id :"+w[i].getid()+"\t"+"ward name :"+w[i].getname());
			  System.out.println("_______________________________________");
			  voter = w[i].getvoter();
			  System.out.println("voter id \tname\t\tage");
			   for(int j=0;j<voter.length;j++)
			   {

				  System.out.println(voter[j].getid()+"\t\t"+voter[j].getname()+"\t\t"+voter[j].getage());
			      a[k]=voter[j].getage();
			      k++;
			   }


			System.out.println("\n");
	      }
	}
	public void CountVoter()
	{

		for(int i=0;i<k;i++)
		{
			if(a[i]<18)
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		System.out.println("___________________________________");
		System.out.println("Voter Count :"+count1);
		System.out.println("Eligale Voter Count :"+count);
	}


}
public class VoterApplication
{
	public static void main(String x[])
	{
	  Ward w = new Ward();
		w.setid(1);
		w.setname("Giridhar Nagar");
      Voter v = new Voter();
		v.setid(1);
		v.setname("ABC");
		v.setage(20);
      Voter v1 = new Voter();
		v1.setid(2);
		v1.setname("PQR");
		v1.setage(30);

	 w.setvoter( new Voter[]{v,v1});  //anonymous array


		Ward w1 = new Ward();
			w1.setid(2);
			w1.setname("Hanuman Nagar");
		Voter vv = new Voter();
				vv.setid(10);
				vv.setname("DABC");
				vv.setage(18);
		Voter vv1 = new Voter();
				vv1.setid(20);
				vv1.setname("PPQR");
				vv1.setage(49);
		Voter vv2 = new Voter();
				vv2.setid(30);
				vv2.setname("XYZ");
				vv2.setage(10);

    	w1.setvoter( new Voter[]{vv,vv1,vv2});

		VottingMachine sw = new VottingMachine();
		sw.setWards( new Ward[]{w,w1});
		sw.CountVoter();

	}
}


