package geeksforgeeks.amazon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class no_duplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String p = s.next();
        Set<Character> h = new HashSet<>();
        Stack<Character> m1  = new Stack<>();
        Stack<Character> m2  = new Stack<>();
        for( int i = 0 ; i< p.length(); i++)
        {
            if(( m1.size() != 0 )&&(m1.peek() != p.charAt(i)))
                m1.add(p.charAt(i));
            else
                m2.add(p.charAt(i));
        }
        m1.addAll(m2);
        System.out.println();

    }
}
