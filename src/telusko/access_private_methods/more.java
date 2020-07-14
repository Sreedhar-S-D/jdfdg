package telusko.access_private_methods;

import org.w3c.dom.ls.LSOutput;

class ABC
{

}

class A extends ABC
{

}

public class more
{
    public static void main(String[] args) throws Exception
    {
        Class c = Class.forName("telusko.access_private_methods.A");
        System.out.println(c.getSuperclass());
    }
}
