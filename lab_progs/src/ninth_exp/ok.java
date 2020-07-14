package ninth_exp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ok {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for( int i = 0 ; i< n; i++)
        {
            String t = s.next();
            a.add(t);
        }
        String b[] = new String[a.size()];
        a.toArray(b);
        System.out.println(b);
        ArrayList<String> h = new ArrayList<>(a);
        Collections.reverse(h);
        System.out.println(h);
        ArrayList<String> o = new ArrayList<>(a.subList(1,5));
        ArrayList<String> clone = (ArrayList<String>)a.clone();
        System.out.println(o);
        System.out.println(clone);

    }
}
