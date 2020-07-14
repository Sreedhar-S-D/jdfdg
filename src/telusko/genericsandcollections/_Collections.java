package telusko.genericsandcollections;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _Collections {
    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>();
        n.add(5223);
        n.add(62312);
        n.add(73129);
        n.add(8231);
        n.add(922110);
        n.add(102338);
        Collections.sort(n,(o1, o2) -> {
            if (o1 % 10 > o2 % 10)
                return 1;
            return -1;
        });
        n.forEach(System.out::println);
        sweat s = () -> System.out.println("Kya re");
        s.show();
        M b = new M();
        Collections.sort(n,b);
        n.forEach(System.out::println);


    }
}

interface sweat
{
    public void show();
}

class M implements Comparator<Integer>
{

    @Override
    public int compare(Integer o1, Integer o2) {
        Integer g1 = o1;
        Integer g2 = o2;
        while( o1 > 0) {
            g1 = o1 % 10;
            o1 /= 10;
        }
        while( o2 > 0) {
            g2 = o2%10;
            o2 /= 10;
        }
        if( g1 > g2)
            return -1;
        else if (g1 == g2)
            return 0;
        else
            return 1;
    }
}

class Movies
{
    String Name;
    String year;

}
