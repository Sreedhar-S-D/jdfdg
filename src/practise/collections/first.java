package practise.collections;

import com.sun.javafx.geom.transform.Identity;
import javafx.collections.ObservableList;

public class first {

    static Object Identity(Object x)
    {
        return x;
    }
    static int sum( int a, int b)
    {
        return a+b;
    }

    public static void main(String[] args)
    {
        Integer p = (Integer)Identity(new Integer(2));
        int r = sum( new Integer(1), new Integer(2));
        double k = (double)Identity(new Double(2.0));

    }
}
