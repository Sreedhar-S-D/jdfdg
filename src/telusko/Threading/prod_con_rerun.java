package telusko.Threading;

class q
{
    int num;
    boolean valueSet = false;
    public synchronized void put(int num)
    {
//        while (valueSet) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//
//        }
        System.out.println("Put :" + num);
        this.num = num;
        this.valueSet = true;
//        notify();

    }
    public synchronized void get(int num)
    {
//        while (!valueSet) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
        System.out.println("Get :" + num);
        this.valueSet = false;
//        notify();
    }
}

class  producer implements Runnable
{
    q w;
    producer(q w)
    {
        this.w = w;
        Thread t = new Thread(this,"Producer");
        t.start();

    }

    public void run()
    {
        while (true)
        {
            w.put(++w.num);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class consumer implements Runnable
{
    q w;
    public consumer(q w)
    {
        this.w = w;
        Thread t = new Thread(this,"Producer");
        t.start();

    }
    public  void run()
    {
        int i = 0;
        while (true)
        {
            w.get(w.num--);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class prod_con_rerun {
    public static void main(String[] args) throws Exception{
        q q1 = new q();
        new producer(q1);
        new consumer(q1);

    }
}
