import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class tpart2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of fruits");
        int fruits = s.nextInt();
        System.out.println("Enter the fruit and the initial capacity");
        HashMap<String,Integer> j = new HashMap<>();
        for( int i = 0 ; i< fruits; i++)
        {
            System.out.println("Fruit "+ (i+1)+ " name");
            String h = s.next();
            System.out.println("Initial capacity of "+h+" in the market");
            int g = s.nextInt();
            j.put(h, g);
        }
        market m = new market(j,fruits);
        Thread t1 = new Thread(new Farmer(m));
        Thread t2 = new Thread(new Customer(m));
        t1.start();
        t2.start();

    }
}

class market
{
    HashMap<String, Integer> k;
    HashMap<Integer, String> m;
    int no_of_fruits;
    boolean whoschance;
    market( HashMap<String, Integer> f, int no_of_fruits)
    {
        k = new HashMap<>();
        m = new HashMap<>();
        k = f;
        whoschance = true;
        this.no_of_fruits = no_of_fruits;
        int j = 1;
        for(Map.Entry<String,Integer> k: f.entrySet())
        {
            m.put(j++,k.getKey());
        }
    }
    void produce()
    {
        while (true) {
        synchronized (this)
        {

                if (!whoschance) {
                    int fe = (int) (Math.random() * 100);
                    int gw = 1 + (int) (Math.random() * no_of_fruits);
                    String hn = m.get(gw);
                    int as = k.get(hn);
                    if (as == 1000) {
                        System.out.println("Market at top capacity for the fruit"+hn);
                    } else if (fe + as > 1000) {
                        System.out.println("Market now has 1000 fruit of kind " + hn);
                        System.out.println("Rest " + (fe + as - 1000) + " fruits of the kind " + hn + " rotted");
                        k.put(hn, 1000);
                    } else {
                        int r = fe + as;
                        System.out.println(fe+" fruits were added to the market of the kind "+ hn);
                        k.put(hn, r);
                    }

                } else {
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
        while (true) {
        synchronized (this) {

                if (whoschance) {
                    int fe = (int) (Math.random() * 1000);
                    int gw = 1 + (int) (Math.random() * no_of_fruits);
                    String hn = m.get(gw);
                    int as = k.get(hn);
                    if (as == 0) {
                        System.out.println("Market is out of capacity for the fruit " + hn);
                        System.out.println("Let the farmer grow the crops");
                    } else if (as - fe <= 0) {
                        System.out.println("The fruit " + hn + " went out of stock because of very high demand in the market");
                        k.put(hn, 0);
                    } else {
                        int r = as - fe;
                        System.out.println(fe + " number of fruit were consumed for the fruit " + hn);
                        k.put(hn, r);
                    }
                } else {
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

class Farmer implements Runnable
{
    market m;
    Farmer(market m)
    {
        this.m = m;
    }

    @Override
    public void run() {
        m.produce();
    }
}

class Customer implements Runnable
{
    market m;

    public Customer(market m) {
        this.m = m;
    }

    @Override
    public void run() {
        m.consume();
    }
}
