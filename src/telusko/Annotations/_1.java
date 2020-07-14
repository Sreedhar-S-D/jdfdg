package telusko.Annotations;

import java.util.ArrayList;


@FunctionalInterface
interface ABC
{
    public void show();
}
class A
{
    public void show()
    {
        System.out.println("in A");
    }
}
class B extends A
{
    @Override
    public void show() {
        ArrayList<Integer> obj = new ArrayList<>();
        System.out.println("in B");
    }
}


public class _1 {

}
