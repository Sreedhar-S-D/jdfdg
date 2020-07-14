package telusko.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class comparator {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("Hi");
        s.add("Hello");
        s.add("Nihau");
        s.add("Ola");
        s.add("Namaste");
        s.add("Namaskara");
//        Comparator<String> s1 =( o1, o2) -> {
//                if(o1.charAt(0)>o2.charAt(0))
//                    return 1;
//                else if(o1.charAt(0) < o2.charAt(0))
//                    return -1;
//                else
//                    return 0;
//            };
        s.forEach(System.out::println);
        System.out.println("\n");
        Collections.sort(s,(o1, o2) -> {
            if(o1.contains("e") && !o2.contains("e"))
                return -1;
            else
                return 0;
        });
        s.forEach(System.out::println);

    }
}
