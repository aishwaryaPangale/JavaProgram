import java.util.*;
public class First
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		int i,sum,min;

		System.out.println("\nEnter the Array Element ");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array ");
		for(i=0;i<5;i++)
		{
			System.out.println("\t"+a[i]);
		}

/*----------------------------------------------------------------------------------*/
		/*Sum of Array

		sum=0;
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of array  : "+sum);*/

/*----------------------------------------------------------------------------------*/
	    /*maximum minimum

	    max=a[0];
	    min=a[0];
	    for(i=0;i<a.length;i++)
	    {
			if(max<=a[i])
			{
				max=a[i];
			}
			else if(min>=a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Maximimun : "+max);
		System.out.println("Minimum : "+min);*/


/*----------------------------------------------------------------------------------*/

		/*Ascending order

		int temp,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(a[i]<=a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}*/

 /*------------------------------------------------------------------------------------------*/
		/*   Inserte element

		int index,value;

		System.out.println("Enter the index and value "); //1 2 3 4 5
		index=sc.nextInt();
		value=sc.nextInt();  //3 100

		for(i=5;i>index;i--) //5
		{

				a[i]=a[i-1];

	    }
	    a[index]=value;
		System.out.println("Display Array ");
		for(i=0;i<6;i++)
		{
			System.out.println("\t"+a[i]);
		}*/


 /*----------------------------------------------------------------------------------------*/
  		/*   Missing Element

  		int j;
		for(i=0;i<a.length-1;i++)
		{
			for(j=a[i];j<a[i+1]-1;j++)
			{
				System.out.println("\t"+(++j));
			}
		}*/

/*----------------------------------------------------------------------------------*/

		/*Array Reverse */
		int temp,j;
		for(i=0,j=a.length-1;i<a.length/2;i++,j--)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}

		System.out.println("Reverse Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}

/*----------------------------------------------------------------------------------*/

          /*Occurance Array*/
          /*int count=1;

          for(i=0;i<a.length;i++)
          {
			  if(i==a.length-1)
			  {
				  System.out.printf("\n%d------%d",a[i],count);
			  }
			  else if(a[i]==a[i+1])
			  {
				  count++;
			  }
			  else
			  {
				  System.out.printf("\n%d------%d",a[i],count);
				  count=1;
			  }
		  }*/


/*-------------------------------------------------------------------------------------*/

            /*Delete Element */

            /* int p,j;
            System.out.println("Enter the index for you delete ");
            p=sc.nextInt();
            for(i=0;i<a.length;i++)
            {
				if(i==p)
				{
					for(j=i;j<a.length-1;j++)
					{
						a[j]=a[j+1];
					}
				}
			}
			System.out.println("\nArray ");
			for(i=0;i<a.length-1;i++)
			{
				System.out.println("\t"+a[i]);
			}*/

/*-------------------------------------------------------------------------------------*/

       /*Second max before logic to type desecnding order logic
            int sec=0,max=0;


		for(i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			else if(a[i]>sec)
			{
				sec=a[i];
			}
		}
		System.out.println("Second largest :"+sec);
		System.out.println("largest :"+max);*/

/*-----------------------------------------------------------------------------------------------*/

         /*Majority element */

         /*int count=1,flag=0;
         for(i=0;i<a.length;i++)
         {
			 if(i!=a.length-1&&a[i]==a[i+1])
			 {
				 count++;
			 }
			 else
			 {
				 if(count>a.length/2)
				 {
					 flag=1;
					 System.out.println("Array is majority ");
					 break;
				 }
				 count=1;
			 }
		 }
		 if(flag==0)
		 {
			 System.out.println("Array is not majority ");
		 }*/

/*------------------------------------------------------------------------------------*/

        /*  char ch;
          System.out.println("Enter the String ");
          String str = sc.nextLine();
          char []c  =str.toCharArray();

          System.out.println("Display String ");

			  System.out.println("\t"+c);

        */










	}
}
