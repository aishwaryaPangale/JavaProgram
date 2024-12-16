import java.util.*;
class Vehicle
{
	protected String vmodel;
	protected String rno;
	protected int fcapacity;
	protected int fconsumption;
	protected int distance;
	protected int time;
	protected int speed;
	protected int total;
	 Vehicle(String vmodel,String rno,int fcapacity,int fconsumption)
	{
		this.vmodel=vmodel;
		this.rno=rno;
		//this.vspeed=vspeed;
		this.fcapacity=fcapacity;
		this.fconsumption=fconsumption;
	}
	void fuelNeeded(int distance)
	{
		this.distance=distance;
		total=fconsumption/distance;
	}
	void distenceCovered(int time)
	{
		this.time=time;
		speed=distance/time;
	}
	void display()
	{
		System.out.println("Vehicle mode\tRegistration number\tfuel capacity\tfuel consumption");
		System.out.println(vmodel+"\t\t"+rno+"\t\t\t"+fcapacity+"\t\t\t"+fconsumption);
		System.out.println("fuel Needed \t Speed");
		System.out.println(total+"\t"+speed);
	}
}
class Truck extends Vehicle
{
	int cwl;
	Truck(String vmodel,String rno,int fcapacity,int fconsumption,int cwl)
	{
		super(vmodel, rno, fcapacity,fconsumption);
		this.cwl=cwl;
	}
	void display()
	{
		super.display();
		System.out.println("Cargo weigth limit: "+cwl);
	}
}
class Bus extends Vehicle
{
	    int noPassenger;
		Bus(String vmodel,String rno,int fcapacity,int fconsumption,int noPassenger)
		{
			super(vmodel, rno, fcapacity,fconsumption);
			this.noPassenger=noPassenger;
		}
		void display()
		{
			super.display();
			System.out.println("no of passenger : "+noPassenger);
	    }
}
class Transport
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vehicle model,Registration number,fuel capacity,fuel consumption ");
		String vmodel = sc.next();
		String rno = sc.next();
		//int vspeed = sc.nextInt();
		int fcapacity = sc.nextInt();
		int fcons = sc.nextInt();

		System.out.println("Enter the distance and time ");
		int distance = sc.nextInt();
		int time = sc.nextInt();

		System.out.println("1)Track Trasport 2)Bus Trasport");
		System.out.println("Enter the choice");
		int n=sc.nextInt();

		switch(n)
		{
			case 1 : System.out.println("Enter the cargo weigth");
					 int cwl = sc.nextInt();
					 Truck t = new Truck(vmodel,rno,fcapacity,fcons,cwl);
					 t.fuelNeeded(distance);
					 t.distenceCovered(time);
					 t.display();
					 break;
		   case 2 : System.out.println("Enter number of passenger ");
		            int npass = sc.nextInt();
		            Bus b = new Bus(vmodel,rno,fcapacity,fcons,npass);
		            b.fuelNeeded(distance);
		            b.distenceCovered(time);
		            b.display();
		            break;
		  default : System.out.println("Invalid choice");
	  }
  }
}

