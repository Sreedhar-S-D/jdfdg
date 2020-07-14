package telusko.genericsandcollections;

import telusko.Serializability.Student;

import java.util.*;

public class first {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(2,2);
        for( int x : values)
        {
            System.out.println(x+" ");
        }
        Set<Integer> new1 = new HashSet<>();
        Map<Integer,String> value2 = new HashMap<>();
        Collection<student> s1 = new Collection<student>();

    }
}

class student
{
    int x;
    int y;

    public student(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Collection<T>
{
    T value;
    public void show()
    {
        System.out.println(value.getClass().getName());
    }
    public void demo( ArrayList<? extends T>  obj)
    {

    }
}
