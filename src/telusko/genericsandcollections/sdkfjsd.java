package telusko.genericsandcollections;


import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class sdkfjsd
{
    public static void main( String args[])
    {
        List<String> b = new ArrayList<>();
        b.add("Colors");
        b.add("Red");
        b.add("Green");
        b.add("Blue");
        ArrayList<String> m = new ArrayList<>(b);
        System.out.println("B being printed");
        b.forEach(System.out::println);
        System.out.println("M being printed");
        m.forEach(System.out::println);
        System.out.println("Hi there ");
        Collections.sort(m ,(o1, o2)->
        {
            if( o1.length() > o2.length())
                return 1;
            else if( o1.length() == o2.length())
                return 0;
            return -1;
        });
        m.forEach(System.out::println);
        K g = new K();
        Collections.sort(b, g);
        b.forEach(System.out::println);

    }
}

class K implements Comparator<String>
{
    //@Override
    public int compare(String o1 , String o2 )
    {
        if(o1.charAt(1) >o2.charAt(1))
            return 1;
        else if(o1.charAt(1) < o2.charAt(1))
            return 0;
        return -1;
    }
}



