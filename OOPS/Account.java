import java.util.*;
public class Account {
    /*
     * All variables are initialised with private access modifiers.
     * This is done to prevent the direct access of variables through object.
     * These are accessed and updated through Getter and Setter methods respectively.
     */
    private String name;
    private int balance;
    private int PIN;
    private String lastTransaction;
    /*
     * Account class Constructor to initialise the values.
     */
    public Account(String name,int balance,int PIN,String lastTransaction)
    {
        this.name=name;
        this.balance=balance;
        this.PIN=PIN;
        this.lastTransaction=lastTransaction;
    }
    Scanner sc=new Scanner(System.in);
    /*
     * Getter methods to get the private variable values.
     */
    public int getBalance()
    { 
        if(checkPin())
        return balance;
        else 
        return -1;
    }
    public int getPIN()
    {
        return PIN;
    }
    public void setBalance(int amt)
    {
        this.balance=amt;
    }
    public void setPin(int pin)
    {
        this.PIN=pin;
    }
    /*
     * checkPin() function is used to validate the PIN.
     */
    public boolean checkPin()
    {
        System.out.println("\nEnter Your PIN : ");
        int pin=sc.nextInt();
        if(pin==getPIN())
        {
            return true;
        }
        else 
        {
            System.out.println("\nPlease Enter a valid PIN");
            return false;
        }

    }
    /*
     * withDrawl() function Validates the PIN and allows the user to perform withdrawl operation.
     * On successfull withdrawl the balance is updated.
     */
    public void withDrawl()
    {
        if(checkPin())
        {
            System.out.println("\nEnter Amount for withdrawl: ");
            int amt=sc.nextInt();
            if(amt<=balance)
            {
                System.out.println("\nWithdrawl of Rupees "+amt+" is successfull");
                setBalance(balance-amt);
                lastTransaction="Withdrawl of "+amt+" Rupees";
            }
            else 
            {
                System.out.println("\nYou don\'t have sufficient balance");
            }
        }
    }
    /*
     * depositMoney() function Validates the PIN and allows user to perform deposit operation.
     * on successfull deposit the balance is updated.
     */
    public void depositMoney()
    {
        if(checkPin())
        {
            System.out.println("\nEnter Amount to be depoisted: ");
            int amt=sc.nextInt();
            setBalance(balance+amt);
            System.out.println("\nAmount "+amt+" Deposited successfully");
            lastTransaction="Deposit of "+amt+" Rupees";
        }
    }
    /*
     * updatePin() is used to update the Account pin.
     */
    public void updatePin()
    {
        if(checkPin())
        {
            System.out.println("\nEnter new PIN : ");
            int pin=sc.nextInt();
            System.out.println("\nAre you sure that you want to change your pin.(Y/N)");
            char ch=sc.next().toUpperCase().charAt(0);
            if(ch=='Y')
            {
                setPin(pin);
                System.out.println("\nPIN set successfully");
            }
        }
    }
    /*
     * Last Transaction Details can be acquired through getLastTransactionDetails() function.
     */
    public void getLastTransactionDetails()
    {
        System.out.println("\nYour last transaction was "+lastTransaction);
    }
}
