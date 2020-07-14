package practise.collections;

import com.google.gson.internal.bind.util.ISO8601Utils;
import com.mysql.cj.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class _LinkedLists {
    public static void main(String[] args) {

        LinkedList<String> p = new LinkedList<>();
        Collections.addAll(p,"SSD","HDD","SSD","Flash Memory","SSD","Pen drive","Registers ");
        p.forEach(System.out::println);
        System.out.println(p);

        System.out.println(p.get(0));
        System.out.println(p.get(p.size()-1));
        System.out.println(p.indexOf("SSD"));
        System.out.println(p.lastIndexOf("SSD"));
        LinkedList<String> r = new LinkedList<>();
        String l = p.poll();
        System.out.println(l);
        System.out.println(p.contains("Pen drive"));
        ArrayList<String> m = (ArrayList)new ArrayList<>(p);
        System.out.println(m);
        String j = "python java python java python";
        String m2 = j.replace("python","java").replaceAll("java","python");
        System.out.println(m2);


    }
}
