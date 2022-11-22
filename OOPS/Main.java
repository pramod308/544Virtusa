import java.util.*;
import java.lang.Thread;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        /*
         * Creating an account with Four attributes
         * 1.Account name
         * 2.Account balance(initialised with 100)
         * 3.Card PIN
         * 4.Last Transaction Details
         */
        Account ac=new Account("Pramod",100,1234,"None");
        do
        {
            /*
             * Thread Exception Catch.
             */
            try{
            Thread.sleep(500);//Output delay for 500ms
            }
            catch(Exception e){}
            System.out.println("\n=========================================================");
            /*
             * MainMenu with 6 Options
             */
            System.out.printf("\nMainMenu:\n\n1.Check Bank balance\n2.Withdrawl\n3.Deposit\n4.Change PIN\n5.Last Transaction Details\n6.Exit\n");
            System.out.println("\nEnter your choice: ");
            int ch=sc.nextInt();
            int balance;
            switch(ch)
            {
                case 1:
                       balance=ac.getBalance();
                       /*
                        * balance=-1 implies an invalid PIN entry. 
                        */
                       if(balance!=-1)
                       System.out.println("\nYour Balance is: "+balance);
                       break;
                case 2:
                       ac.withDrawl();
                       break;
                case 3:
                       ac.depositMoney();
                       break;
                case 4:
                       ac.updatePin();
                       break;
                case 5:
                       ac.getLastTransactionDetails();
                       break;
                case 6:System.out.println("\nThank You!! See you Again.");
                System.exit(0);
            }
            System.out.println("\n=========================================================");
        }while(true);
    }
}
