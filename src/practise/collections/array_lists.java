package practise.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class array_lists {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.forEach(System.out::println);
        Iterator i = colors.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        colors.add(0,"Purple");
        colors.forEach(System.out::println);
        colors.set(3 ,"Nayacolour");
        colors.forEach(System.out::println);
        colors.remove(3);
        colors.forEach(System.out::println);
        System.out.println(colors.contains("Blue"));
        Collections.sort(colors);
        System.out.println();
        colors.forEach(System.out::println);

        ArrayList<String> color2 = (ArrayList)colors.clone();
        System.out.println();
        color2.forEach(System.out::println);
        System.out.println();
//        Collections.shuffle(colors);
        colors.forEach(System.out::println);
        System.out.println();
//        Collections.reverse(color2);
        color2.forEach(System.out::println);
        List<String> color3 = colors.subList(2,4);
        System.out.println();
        color3.forEach(System.out::println);
        System.out.println(color3);
        ArrayList<String> m = new ArrayList<>();
        for( String p : colors)
        {
            m.add( color2.contains(p) ? "Yes":"No");
        }
        System.out.println(m);
        System.out.println(colors);
        Collections.swap(colors,2,1);
        System.out.println(colors);
        colors.addAll(color2);
        System.out.println(colors);
//        ArrayList<String> f = new ArrayList<>();
//        Collections.copy(colors,f);
//        System.out.println(colors);
//        colors.removeAll(color2);
//        System.out.println(colors);
//        System.out.println(colors.isEmpty());
        colors.trimToSize();
        System.out.println(colors);
        colors.ensureCapacity(20);
        System.out.println(colors);
//        colors.set();
        String[] g = (String[]) m.toArray();


    }
}
