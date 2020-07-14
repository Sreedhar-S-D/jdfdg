package telusko;

public class first {

    public static void main(String[] args)
    {
        B obj = new B();
        obj.num1 = 5;
        obj.num2 = 6;
        System.out.println("\npehle ke pehle result tha :"+obj.result);
        obj.add();
        System.out.println("\npehle result hai :"+obj.result);
        obj.sub();
        System.out.println("\ndoosra result hai :"+obj.result);

    }
}


class A
{
    int result,num1,num2;
    A()
    {
        System.out.print("kasa kay");
    }
    public void add()
    {
        result = num1 + num2;
    }
}

class B extends A
{

    B()
    {
        System.out.print(" BHAU");
    }
    public void add()
    {
        super.add();
        System.out.println("Beech ka result hai "+result);
        result = num1 * num2;
    }
    public void sub()
    {
        result = num1 - num2;
    }
}