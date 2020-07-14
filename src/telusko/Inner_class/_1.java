package telusko.Inner_class;

public class _1 {
    public static void main(String[] args) {
        A obj = new A();
        obj.i = 0;
        System.out.println(obj.i);
        A.B obj1 = new A.B();
        obj1.j = 1;
        System.out.println(obj1.j);
    }
}
class A
{
    int i;
    static class B
    {
        int j;
    }
}
