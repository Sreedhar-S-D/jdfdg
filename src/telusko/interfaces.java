package telusko;

public class interfaces
{
    public static void main(String[] args) {

        d v = new d();
        if( v instanceof abc)
        v.show();

    }
}

interface abc
{

}

class d implements abc
{
    public void show()
    {
        System.out.println("hello");
    }

}


