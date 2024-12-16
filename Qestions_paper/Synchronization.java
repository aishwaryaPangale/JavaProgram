import java.util.*;
class Show
{
	synchronized void getResult(int no)
	{
		try{

					if(no==1)
					{
						for(int i=1;i<=10;i++)
						{
							System.out.println("Thread First :"+i);
							if(i==5)
							{
								wait();
							}
							Thread.sleep(1000);
						}
					}
					else if(no==2)
					{
						for(int i=0;i<26;i++)
						{
							System.out.println("Thread Second :"+(char)(i+65));
							Thread.sleep(1000);
						}
					}
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		}
	}
	synchronized void rejoin()
	{
		try{
			notifyAll();
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		}
	}
}

class Alphabet extends Thread
{
	Show s;
	void setValue(Show s)
	{
		this.s=s;
	}
	public void run()
	{
		s.getResult(1);
	}
}
class Digit extends Thread
{
	Show s;
	void setValue(Show s)
	{
		this.s=s;
	}
	public void run()
	{
		s.getResult(2);
	}
}
public class Synchronization
{
	public static void main(String x[])throws Exception
	{
		Show s = new Show();
		Alphabet a = new Alphabet();
		a.setValue(s);
		a.start();

		Digit d = new Digit();
		d.setValue(s);
		d.start();
		Thread.sleep(10000);
		do{
			Scanner sc = new Scanner(System.in);
			String msg = sc.next();
			if(msg.equals("restart"))
			{
				s.rejoin();
			}
		}while(true);

	}
}
/*
import java.util.*;
class EvenOdd
{
	synchronized void printResult(int no)
	{
		try
		{
			if(no==0)
					{
						for(int i=0;i<=10;i++)
						{
							if(i%2==0)
							{
								System.out.println("Even :"+i);
								if(i==5)
								{
									wait();
								}
								Thread.sleep(1000);
							}
						}
					}
					else if(no==1)
					{
						for(int i=0;i<=10;i++)
						{
							if(i%2!=0)
							{
								System.out.println("Odd :"+i);
							}
						}
					}
		}
		catch(Exception ex)
		{
			System.out.println("Error is :"+ex);
		}
	}
}
class Even extends Thread
{
	EvenOdd eo;
	void setValue(EvenOdd even)
	{
		eo=even;
	}
	public void run()
	{
		eo.printResult(0);
	}
}
class Odd extends Thread
{
	EvenOdd eo;
	public void setValue(EvenOdd odd)
	{
		eo=odd;
	}
	public void run()
	{
		eo.printResult(1);
	}
}
public class Synchronization
{
	public static void main(String x[])throws Exception
	{
		EvenOdd e = new EvenOdd();
		Even ev = new Even();
		ev.setValue(e);
		ev.start();

		Odd o = new Odd();
		o.setValue(e);
		o.start();
	}
}*/