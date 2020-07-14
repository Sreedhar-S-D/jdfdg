package telusko.Threeeding;

class Printer
{
    synchronized void printDocument( int num, String docName)
    {
        for( int i = 0 ; i<10 ; i++)
        {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Printing +"+docName+" "+i );
        }
    }
}

class Mythread extends Thread
{
    Printer pRef;
    Mythread(Printer p)
    {
        pRef = p;
    }

    @Override
    public void run() {
        synchronized (pRef) {
            pRef.printDocument(10, "SSDsolutions");
        }
    }
}

class YourThread extends Thread{
    Printer pRef;
    YourThread(Printer p)
    {
        pRef = p;
    }

    @Override
    public void run() {
        synchronized (pRef) {
            pRef.printDocument(10, "Kaslasolutions");
        }
    }
}

public class first {
    //main thread
    public static void main(String[] args) {
        System.out.println("Job started ");

        Printer printer = new Printer();
        Mythread mref = new Mythread(printer);
        YourThread yref = new YourThread(printer);
        mref.start();
        yref.start();
        System.out.println("Job finished ");

    }
}
