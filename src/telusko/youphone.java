package telusko;

public class youphone
{
    public static void main(String[] args)
    {
     iphone i= new iphone();
     samsung s = new samsung();
     showing( s );
     showing( i );

    }
    public static void showing( phone p)
    {
        p.show();
    }

}


abstract class phone
{
    public abstract void show();
}

class iphone extends phone
{
    public void show( )
    {
        System.out.println("4 gb , Ios -13");
    }
}

class samsung extends phone
{
    public void show()
    {
        System.out.println("4 gb , Pineapple");
    }
}