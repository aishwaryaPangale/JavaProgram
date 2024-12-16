import java.util.*;
class Table
{
	int no,i;
	void setNumber(int a)
	{
		no=a;
	}
	void showTable()
	{
		System.out.println("Table for "+no);
		for(i=1;i<=10;i++)
		{
			System.out.println(no+" * "+i+" = "+(no*i));
		}
	}
}
public class TableApp
{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int no = sc.nextInt();
		Table t= new Table();
		t.setNumber(no);
		t.showTable();
	}
}
