package telusko.interfaces1;

import java.io.*;

// A simple interface
interface In1
{
    // public, static and final
    final int a = 10;

    // public and abstract
    void display();
}

// A class that implements the interface.
class TestClass implements In1
{
    // Implementing the capabilities of
    // interface.
    public void display()
    {
        System.out.println("Geek");
    }

    // Driver Code
//    public static void main (String[] args)
//    {
//        TestClass t = new TestClass();
//        t.display();
//        System.out.println(a);
//    }
}

class second{
    public static void main(String[] args) {

        System.out.println(In1.a);
        Integer x = new Integer(5);
        Integer y = new Integer(6);
        System.out.println(x.equals(y));
        System.out.println(x.intValue());
        System.out.println(x.intValue() + " "+ y.intValue());

    }

}


