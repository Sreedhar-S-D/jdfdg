package telusko.genericsandcollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _sets {
    public static void main(String[] args) throws Exception  {
        Set<Integer> values = new HashSet<>();
        values.add(7);
        values.add(5);
        values.add(6);
        values.add(6);
        values.forEach(System.out::println);
        Iterator t  = values.iterator();

    }
}
