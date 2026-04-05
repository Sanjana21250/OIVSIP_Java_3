import java.util.*;
class ATMFunctionality
{
	private int userId;
	private int userPin;
	private static double balance=1000;
	private static List<String> transactions=new ArrayList<>();
	public ATMFunctionality(int userId,int userPin)
	{
		this.userId=userId;
		this.userPin=userPin;
		if(authenticate(userId,userPin))
		{
			ATMInterface.menu();
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	public static void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			transactions.add("Deposited:"+amount);
			System.out.println("Amount deposited successfully.");
		}
		else
		{
			System.out.println("Inavlid deposit amount.");
		}
	}
	private boolean authenticate(int userId,int userPin)
	{
		if(userId==1001 && userPin==3026)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void withdraw(double amount)
	{
		if(amount<=balance)
		{
			balance-=amount;
			transactions.add("Withdraw:"+amount);
			System.out.println("Withdrawal Successful.");
		}
		else
		{
			System.out.println("Insufficient Balance.");
		}
	}
	
	public static void showTransactions()
	{
		if(transactions.isEmpty())
		{
			System.out.println("No transactions yet.");
		}
		else
		{
		System.out.println("Transactions History:");
		for(String t:transactions)
		{
			System.out.println(t);
		}
		}
	}
	public static void transfer(int acc,double amount)
	{
		if(amount<=balance)
		{
			balance-=amount;
			transactions.add("Transfer to "+acc+":"+amount);
			System.out.println("Trander Successful");
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}
