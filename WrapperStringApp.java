import java.util.*;
public class WrapperStringApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1) Reversing a String.\n2) Inserting Character.\n3) Appending a String.\n4) Delete the charater from String");
		System.out.println("5) Replace a substring.\n6) Capacity");

		System.out.println("-----------------------------------------------");
		System.out.println("Enter your choice ");
		int choice = sc.nextInt();

		String str;
		int i,j;
		char temp;
		switch(choice)
		{
			case 1:   System.out.println("Enter the string ");
					  str = sc.next();
					  char ch[]=str.toCharArray();
					  for(i=0,j=ch.length-1;i<ch.length/2;i++,j--)
					  {
						  temp=ch[i];
						  ch[i]=ch[j];
						  ch[j]=temp;
					  }
					  System.out.println("Reverse String :"+String.valueOf(ch));
			           break;


			case 2:    System.out.println("Enter the string ");
			           str=sc.next();
			           char[] ch1=str.toCharArray();
			           int len = ch1.length;

			           char[] arr = new char[len+1];

			           System.out.println("Enter the index ");
			           int index = sc.nextInt();

			           System.out.println("Enter the character ");
			           char c = sc.next().charAt(0);

			            for(i=0;i<index;i++)
			            {
							arr[i]=ch1[i];
						}
					   arr[index]=c;
					   for(i=index;i<len;i++)
					   {
						   arr[i+1]=ch1[i];
					   }
             		   System.out.println(" String is "+String.valueOf(arr));
					   break;


		    case 3:  System.out.println("Enter the string ");
		             str=sc.next();
		             System.out.println("Enter the second string ");
		             String str1 = sc.next();

		             str = str+" ";
		             System.out.println(str+str1);
		    			break;

		    case 4:  System.out.println("Enter the string ");
		             str=sc.next();  //abcdab

		             System.out.println("Enter postion where you delete ");
		             char val = sc.next().charAt(0);

		             char ch2[] = str.toCharArray(); // abd***  c

		             for(i=0;i<ch2.length;i++)
		             {

						  if(ch2[i]==val)
						  {

							  for(j=i+1;j<ch2.length;j++)
							  {
								    if(ch2[i]==ch2[j])
								    {
										 ch2[j]='*';
									}
							  }

						  }
					}
						 int c1=0;
						for(i=0;i<ch2.length;i++)
						{

						 if(ch2[i]==val)
						 {
							 c1++;
						  for(int k=i;k<ch2.length-1;k++)
						  {
							   ch2[k]=ch2[k+1];
						  }
						 }
					 }

					 if(c1==0 )
					 {
						 System.out.println("Data Not Found");
					     for(i=0;i<ch2.length;i++)
						{
							 System.out.println("="+ch2[i]);
						}
					 }

					 else
					 {
						  String s2=null;
						  System.out.println("Data  Found");
						  //for(i=0;i<ch2.length-1;i++)
						 //{

						 //String s1=String.valueOf(ch2[i]);
					       System.out.println(String.valueOf(ch2));

					//}
					 }
					break;

		    case 5:   System.out.println("Enter the string ");
		              //str=sc.next();
		              sc.nextLine();
		              str=sc.nextLine();

		              System.out.println("Enter string to search and string to replace");
		              String ss = sc.next();
		              System.out.println("Enter string to search and string to replace");
		              String srep = sc.next();
		              int sindex=str.indexOf(ss);
		              String leftstr="",rightstr="";
		              for(i=0;i<str.length();i++)
		              {
						  if(i<sindex)
						  {
							  leftstr=leftstr+(str.charAt(i));
						  }
						  if(i>=(sindex+ss.length()))
						  {
							  rightstr=rightstr+(str.charAt(i));
						  }
					  }
					  str="";
					  str=leftstr+srep+rightstr;
					  System.out.println("New string :"+(str));
			          break;

			 case 6:  System.out.println("Enter the string ");
		              str=sc.next();

		               StringBuffer sb = new StringBuffer();
		               System.out.println("Capacity :"+sb.capacity());
		               break;
		    default:System.out.println("Enter correct choice ");

		}
	}
}


