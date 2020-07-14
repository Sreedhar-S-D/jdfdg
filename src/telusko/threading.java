

import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

class threading
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of fruits available in the market");
        int number = s.nextInt();
        TreeMap<String,Integer> u = new TreeMap<>();
        for( int i = 0 ; i< number; i++)
        {
            System.out.println("Enter name of "+(i+1)+" fruit");
            String q = s.next();
            System.out.println("Enter the initial quantity of the fruit (remember the market can only sustain 1000 fruits of each kind )");
            int z = s.nextInt();
            u.put(q,z);
        }
        Market e = new Market(u);
        Thread t1 = new Thread(new farmer(e));
        Thread t2 = new Thread(new consumer(e));
        t1.start();
        t2.start();

    }
}

class Market
{
    TreeMap<String,Integer> m;
    TreeMap<Integer,String> k;
    int i;
    int sums;
    boolean whoschance;
    int maxcapacity;
    Market(TreeMap<String,Integer> j)
    {
        m = new TreeMap<>(j);
        k = new TreeMap<>();
        i = 1;
        sums = 0;
        whoschance = true;
        maxcapacity = 1000;
        for(Map.Entry<String,Integer> L : m.entrySet())
        {
            k.put(i,L.getKey());
            i++;
            sums += L.getValue();
        }
    }

    void produce()
    {
        while(true)
        {
            synchronized (this)
            {

                int j = (int) (1 + (Math.random() * m.size()));
                if(!whoschance) {
                    try {
                        new Thread().sleep(40);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int f = (int) (1 + (Math.random() * 100));// amount to be added ,also random
                    int h = m.get(k.get(j));// amount of the selected fruit , also random
                    if(h == 1000)
                    {
                        System.out.println("Market is at top capacity for the fruit "+k.get(j));


                    }
                    else if(f + h > 1000) {

                        m.put(k.get(j), 1000 );
                        System.out.println("farmer produces "+(1000-h)+" of the fruit "+k.get(j)+" for the market");
                        System.out.println("rest "+(f+h-1000)+" rot as there is not demand in market");

                    }
                    // will give a random number from 1 to 5 which'll select the fruit
                    else {
                        int r = h + f;
                        m.put(k.get(j), r);
                        System.out.println("farmer produced "+f+" of the fruit "+k.get(j));
                    }

                }
                else{
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                whoschance = true;
                notify();
            }
        }

    }


    void consume()
    {
        while(true)
        {
            synchronized (this)
            {
                int j = (int) (1 + (Math.random() * m.size()));
                if (whoschance) {
                    int f = (int) (1 + (Math.random() * 100));// amount to be removed ,also random
                    int h = m.get(k.get(j));// amount of the selected fruit , also random
                    if (f > h) {
                        m.put(k.get(j), 0);
                        System.out.println("Consumer consumed " + h + " of the fruit " + k.get(j));
                        System.out.println("Now the market is out of stock for the fruit "+k.get(j));

                    }
                    // will give a random number from 1 to5 which'll select the fruit
                    else {
                        int r = h - f;
                        m.put(k.get(j), r);
                        System.out.println("Consumer consumed " + f + " of the fruit " + k.get(j));
                    }

                }
                else{
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                whoschance = false;
                notify();
            }
        }
    }

}

class farmer implements Runnable
{
    Market m;
    farmer( Market m)
    {
        this.m = m;
    }

    @Override
    public void run() {
        m.produce();
    }
}

class consumer implements Runnable
{
    Market m;
    consumer( Market m)
    {
        this.m = m;
    }

    @Override
    public void run() {
        m.consume();
    }
}



