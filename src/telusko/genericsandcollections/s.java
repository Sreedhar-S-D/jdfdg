package telusko.genericsandcollections;

import java.util.HashSet;
import java.util.Set;

class s
{
    public static void main( String args[] )
    {
        Set<String> f = new HashSet<>();
        f.add("Geeks");
        f.add("For");
        f.add("Geeks");
        f.add("For");
        f.add("Nothing");
        f.add("Nothing");
        f.add("In");
        f.forEach(System.out::println);

    }
}