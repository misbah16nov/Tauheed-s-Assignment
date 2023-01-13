import java.util.Scanner;
class BankAccount
{
    Scanner sc = new Scanner(System.in);
int accountNumber;
String name , AccountType;
double Balance;

public BankAccount(int accountNumber , String name , String AccountType , double Balance)
{
    this.AccountType = AccountType;
    this.Balance = Balance;
    this.name = name;
    this.accountNumber = accountNumber;
}
public void Deposit()
{
  System.out.println("Enter Amount to Deposit");
  try{
    Balance = Balance+sc.nextDouble();
  }
  catch(Exception E)
  {
    System.out.println(E);
  }

}
public void Withdraw()
{
    System.out.println("Available Balance : Rs "+Balance);
    System.out.println("Enter Amount To Withdraw");
    try{
      Balance = Balance - sc.nextDouble();
    }
    catch(Exception E)
    {
        System.out.println(E);
    }
}
public void Display()
{
      System.out.println("Account Number : "+this.accountNumber+"\nName : "+this.name+"\nAvailable Balance : Rs "+this.Balance);
}
}


public class BankAccountDemo {
   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter Account Number");
       int accountNumber = sc.nextInt();

       System.out.println("Enter Account Type");
       String AccountType = sc.nextLine();

       System.out.println("Enter your Name");
       String name = sc.nextLine();

       System.out.println("Enter Initial Balance");
       double Balance = sc.nextDouble();

     BankAccount BA =  new BankAccount(accountNumber, name, AccountType, Balance);
     BA.Deposit();
     BA.Withdraw();
     BA.Display();
     sc.close();

    }
    
}
