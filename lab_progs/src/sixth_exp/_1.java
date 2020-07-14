package sixth_exp;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        Customer first = new Customer();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Display Balance\n");
            int d = s.nextInt();
            switch (d)
            {
                case 1:{
                    String s1;
                    int depositamt;
                    System.out.println("Enter the deposit amount:");
                    depositamt = s.nextInt();
                    System.out.println("Enter the currency type:");
                    s1 = s.next();
                    try {
                        first.a.deposit(depositamt, s1);
                    } catch (DemonetizationException e) {
                        e.printStackTrace();
                    }
                    break;


                }
                case 2:{
                    System.out.println("Enter amount to be withdrawn :");
                    int p = s.nextInt();
                    first.a.withdraw(p);
                    break;
                }
                case 3:{
                    first.a.currBalance();
                    break;
                }
                default:{
                    System.out.println("Do it correctly :");
                    break;
                }
            }
        }


    }
}

class Customer
{
    Account a;
    Customer()
    {
        a = new Account();
    }
}


class Account{
    int bal_account;
    String currency;
    Account( )
    {
        bal_account= 500;
        currency = "Namo Rupees";
    }
     public void deposit(int n , String s) throws DemonetizationException
    {
            try {
                if (s.equalsIgnoreCase("OLD") && n > 5000)
                    throw new DemonetizationException("Old currency over 5000 not accepted");
                else {
                    this.bal_account += n;
                }
            }
            catch (DemonetizationException e)
            {
                System.out.println(e.getMessage());
            }

    }
     public void withdraw( int n)
    {
        if( n - bal_account > 500)
            System.out.println("Don't do it");
        else
            System.out.println(" OK "+n+"has been withdrawn");


    }
    public void currBalance()
    {
        System.out.println("Your current balance is :"+ this.bal_account);
    }

}

class DemonetizationException extends Exception
{
    DemonetizationException(String str)
    {
        super(str);
    }

}
