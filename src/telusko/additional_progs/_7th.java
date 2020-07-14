package telusko.additional_progs;

import java.util.Scanner;

public class _7th {
    //OddThread to print odd numbers
//Calls printOdd() method of SharedPrinter class until limit is exceeded.



    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the extent to which the thread have to be printed : ");
        int n = s1.nextInt();
        sharedPrinter printer = new sharedPrinter();
        Seven_Multiple sevenMultiple = new Seven_Multiple(n, printer);
        sevenMultiple.setName("sevenThread");
        Eight_Multiple eightMultiple = new Eight_Multiple(n, printer);
        eightMultiple.setName("eightThread");
        sevenMultiple.start();
        eightMultiple.start();
    }

}
class Seven_Multiple extends Thread
{
    int limit;

    sharedPrinter printer;

    public Seven_Multiple(int limit, sharedPrinter printer)
    {
        this.limit = limit;

        this.printer = printer;
    }

    @Override
    public void run()
    {
        int mult_of_seven = 7;

        while (mult_of_seven <= limit)
        {
            printer.printSeven(mult_of_seven);

            mult_of_seven = mult_of_seven + 7;
        }
    }
}

class Eight_Multiple extends Thread
{
    int limit;

    sharedPrinter printer;

    public Eight_Multiple(int limit, sharedPrinter printer)
    {
        this.limit = limit;

        this.printer = printer;
    }

    @Override
    public void run()
    {
        int mult_of_eight = 8;           //First even number is 2

        while (mult_of_eight <= limit)
        {
            printer.printEight(mult_of_eight);          //Calling printEven() method of SharedPrinter class

            mult_of_eight = mult_of_eight + 8;           //Incrementing to next even number
        }
    }
}
class sharedPrinter
{


    boolean isSevenPrinted = false;

    synchronized void printSeven(int number)
    {
        while (isSevenPrinted)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName()+" : "+number);

        isSevenPrinted = true;

        try
        {
            Thread.sleep(10);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        notify();
    }

    synchronized void printEight(int number)
    {
        while (!isSevenPrinted)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName()+" : "+number);

        isSevenPrinted = false;

        try
        {
            Thread.sleep(10);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        notify();
    }
}
