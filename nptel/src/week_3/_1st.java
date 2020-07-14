package week_3;

import java.util.Scanner;

public class _1st {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int p = fib(x);
        System.out.println(p);

    }
    static int fib(int n)
    {
        n = n - 2;
        int t = 0;
        int s = 1;
        int p = 0;
        while(n>0)
        {
            p = s + t;
            t = s;
            s = p;
            n--;
        }
        return p;
    }
}
