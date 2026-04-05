import java.util.*;
public class ATMInterface
{
		public static void menu()
		{
			Scanner sc=new Scanner(System.in);
			int choice;
			do
			{
			System.out.println("\n1.Transactions History \n2.Withdraw \n3.Deposit \n4.Transfer \n5.Quit");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				ATMFunctionality.showTransactions();
				break;
				
				case 2:
				System.out.print("Enter amount to withdraw: ");
				ATMFunctionality.withdraw(sc.nextDouble());
				break;
				
				case 3:
				System.out.print("Enter amount to deposit: ");
				ATMFunctionality.deposit(sc.nextDouble());
				break;
				
				case 4:
				System.out.print("Enter recipient account number: ");
				int acc=sc.nextInt();
				System.out.print("Enter amount: ");
				double amount=sc.nextDouble();
				ATMFunctionality.transfer(acc,amount);
				break;
				
				case 5:
				System.out.println("Thank You!");
				break;
				
				default:
				System.out.println("Invalid Choice.");
			}
		}while(choice!=5);
		}
		
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter User ID: ");
			int userId=sc.nextInt();
			System.out.print("Enter User PIN: ");
			int userPin=sc.nextInt();
			ATMFunctionality atm=new ATMFunctionality(userId,userPin);
		}
}