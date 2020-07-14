package telusko.streams;

interface how
{
    default public void nshow()
    {
        System.out.println("Jai Hanuman");
    }
}

interface what
{
    default public void show()
    {
        System.out.println("Jai Shree Ram");
    }

    default public void week()
    {
        System.out.println("Bolo siyamal Ramchandra Ki Jai");
    }
    static public void work()
    {
        System.out.println("working to build ram mandir");
    }
    static public void wte()
    {
        System.out.println("working to build a bigger ram mandir");
    }
}

public class hi implements how,what{

    public static void main(String[] args) {
        hi m = new hi();
        m.show();
        m.week();
        what.work();
        what.wte();
    }
}
