package telusko;

public class phonevala
{
    public static void main(String[] args)
    {
        Jennyphone s = new Jennyphone();
        s.call();
        s.move();
        s.cook();
        s.dance();
    }
}

abstract class Sreedharphone
{
    public void call()
    {
        System.out.println("calling....");
    }
    public  abstract void move();
    public  abstract void dance();
    public  abstract void cook();

}

abstract class Ayushphone extends Sreedharphone
{
    public void move()
    {
        System.out.println("moving");
    }
}

class Jennyphone extends Ayushphone
{
    public void dance()
    {
        System.out.println("dancing");
    }
    public void cook()
    {
        System.out.println("cooking");
    }
}
