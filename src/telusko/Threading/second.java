package telusko.Threading;

class Hi extends Thread
{
    public synchronized void run()
    {
        for( int i = 0 ; i<5; i++)
        {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("HI");
        }
    }

}
class Hello extends Thread
{
    public synchronized void run()
    {
        for( int i = 0 ; i<5; i++)
        {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("HELLO");
        }
    }

}

public class second {
    public static void main(String[] args) throws Exception {
        Hi h1 = new Hi();
        Hello h2 = new Hello();

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
//        h1.start();
//        Thread.sleep(1);
//        h2.start();
    }
}
