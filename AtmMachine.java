import java.util.Scanner;

class Atm
{
    public void withdraw(int amount,int account)
    {
        int account_balance=200000;
        int withdrawal=account_balance-amount;
        if(amount>account_balance)
        {
            System.out.println("\n****************TRANSACTION FAILED!!! INSUFFICIENT AMOUNT************");

            System.out.println("\nYour Total balance is:"+account_balance);
        }
        else if(amount>100000)
        {
            System.out.println("\n****Amount greater than 100000 Rs. cannot be withdrawed******");

            
        System.out.println("\nYour Total balance is:"+account_balance);
        }
        
        else
        {
            System.out.println("\n*******Amount of "+amount+" has been withdrawed from your account******* ");

            int tobal=account_balance-amount;
        System.out.println("\nYour Total balance is:"+tobal);
        }

         
        
    }

    public void deposit(int amount,int account)
    {
        int account_balance=200000;
        int deposited=account_balance+amount;
        if(amount>150000)
        {
            System.out.println("\n******You cannot deposit amount greater than 150000*******");

            System.out.println("\nYour Total balance is:"+account_balance);
        }
       
        else
        {
            System.out.println("\n******Amount of " +amount+" has been deposited in your account******");

            int tobal=amount+account_balance;
        System.out.println("\nYour Total balance is:"+tobal);
        }
        
        
    }
    public void display(int account,String Name)
    {
        System.out.println("Your account no. is "+account);
        System.out.println("Your Name is "+Name);
      //System.out.println("");
    }
}

public class AtmMachine
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int account,account_balance,choice,amount,pin;
        String Name;
        Atm a=new Atm();
        System.out.println("*******Welcome to ARN BANK*******");
        System.out.println("*********Enter 1 for the withdrawal of amount**********");
        System.out.println("*********Enter 2 for the deposition of amount*********");
        System.out.println("*********Enter 3 for the account display*******");
        choice=s.nextInt(); 

        switch (choice) {
            case 1:
            System.out.print("Enter your account no.:");
            account=s.nextInt();

            System.out.print("Enter your pin:");
            pin=s.nextInt();

            System.out.print("Enter the amount to withdraw:");
            amount=s.nextInt();

           

            a.withdraw(amount,account);
            System.out.println("\n****************Thank you for visiting THE ARN BANK!!! Come Again******************");
            

                break;
                case 2:
                  System.out.print("Enter your account no.:");
            account=s.nextInt();

            System.out.print("Enter your pin:");
            pin=s.nextInt();

            System.out.print("Enter the amount to deposit:");
            amount=s.nextInt();

            

            a.deposit(amount,account);
            System.out.println("\n*****************Thank you for visiting THE ARN BANK!!! Come Again***************");
            break;

            case 3:


              System.out.print("Enter your account no.:");
            account=s.nextInt();

             System.out.print("Enter your name:");
             s.nextLine(); 
              Name = s.nextLine();

           

            a.display(account,Name);
            System.out.println("\n*************Thank you for visiting THE ARN BANK!!! Come Again*************");
            break;

        
            default:
                System.out.println("INVALID INPUT");
        }
    }
    
}
