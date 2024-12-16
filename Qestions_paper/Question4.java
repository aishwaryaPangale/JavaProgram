import java.util.*;
interface Bank
{
 void deposit(double amt);
 void withdraw(double amt);
 double getBalance();
}
class SavingBank implements Bank
{
	public double balance;
	SavingBank()
	{
		this.balance=0.0;
	}
   public void deposit(double amt)
   {
	   if(amt>0)
       {balance=balance+amt;
        System.out.println("Deposited "+amt+" In Saving Bank");
       }
       else
       {
		   System.out.println(" Invalid Deposit Amount");
	   }
   }
   public void withdraw(double amt)
   {
	   if(amt>0 && amt<=balance)
	   {
		balance=balance-amt;
		  System.out.println("Withdraw "+amt+" from Saving Bank");
	   }
	    else
	   {
	    System.out.println(" Invalid Withdraw Amount or Insufficient Balance");
	   }
   }
   public double getBalance()
   {
	   return balance;
   }
}

class CurrentBank implements Bank
{
	public double balance;
	CurrentBank()
	{
	 this.balance=100000.0;
	}
   public void deposit(double amt)
   {
	     if(amt>0)
	     {
			 balance=balance+amt;
	         System.out.println("Deposited "+amt+" In Current Bank");
	     }
	      else
	     {
	   	 System.out.println(" Invalid Deposit Amount");
	     }
   }
   public void withdraw(double amt)
   {    if(amt>0  && amt<=balance)
        {
			balance=balance-amt;
		  System.out.println("Withdraw "+amt+" from Current Bank");
        }
	    else
	   {
	   	 System.out.println(" Invalid Deposit Amount");
	   }
   }
   public double getBalance()
   {
	   return balance;
   }
}

class BankOperation
{
	Bank b;
 public void BankAdapter(Bank b)
 {
	 this.b=b;
 }
 public void performDeposit(double amount)
 {
	 if(b!=null)
	 {
		 b.deposit(amount);
	 }
	 else
	 {
		 System.out.println("No bank Selected");
	 }
 }
 public void performWithdraw(double amount)
 {
	 if(b!=null)
	 {
		 b.withdraw(amount);
	 }
	 else
	 {
		 System.out.println("No Bank Selected");
	 }
 }
 public double checkBalance()
 {
	 if(b!=null)
	 {
	 return b.getBalance();
     }
     else
     {
		 System.out.println("No Bank Selected");
		 return 0.0;
	 }
 }

}

public class Question4
{
 public static void main(String []args)
 {
	   int f;
   SavingBank sb=new SavingBank();
   CurrentBank cb=new CurrentBank();
   BankOperation bo=new BankOperation();
   Scanner sc=new Scanner(System.in);
   System.out.println("1.Saving Bank \n2.Current Bank\nEnter");
   int ch=sc.nextInt();
   int c=0;
   double d=0.0,w=0.0;

   switch(ch)
   {
	   case 1:bo.BankAdapter(sb);
	          do{
	         	 System.out.println("Enter 1.deposit or 2.withdraw or 3.Check Balance");
	         	c=sc.nextInt();
	          	switch(c)
	          	{
	         	  case 1: System.out.println("Enter amount to deposit");
	         	          d=sc.nextDouble();
	         		      bo.performDeposit(d);
	         	          break;
	        	  case 2:
					      System.out.println("Enter amount to Withdraw");
	         	          w=sc.nextDouble();
	         	          bo.performWithdraw(w);
	         	          break;
	         	   case 3: System.out.println("Saving Bank Balance is "+bo.checkBalance());break;
	         	   default:System.out.println("Invalid choice");
	          	  }
                  System.out.println("Do you want to continue (1(yes)/0(No)");
				  f=sc.nextInt();
		       }while(f!=0);
	          break;
	   case 2:bo.BankAdapter(cb);
	          do{
	         	 System.out.println("Enter 1.deposit or 2.withdraw or 3.Check Balance");
	         	c=sc.nextInt();
	          	switch(c)
	          	{
	         	  case 1: System.out.println("Enter amount to deposit");
	         	          d=sc.nextDouble();
	         		      bo.performDeposit(d);
	         	          break;
	        	  case 2:
					      System.out.println("Enter amount to Withdraw");
	         	          w=sc.nextDouble();
	         	          bo.performWithdraw(w);
	         	          break;
	         	   case 3: System.out.println("Saving Bank Balance is "+bo.checkBalance());break;
	         	   default:System.out.println("Invalid choice");
	          	  }
                  System.out.println("Do you want to continue (1(yes)/0(No)");
                  f=sc.nextInt();
		       }while(f!=0);
	          break;
	    default:System.out.println("Invalid Choice");
   }
 }
}