package leetcode;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        Solution m = new Solution();
        int r = m.reverse(p);
        System.out.println(r);
    }
}

class Solution {
    public int reverse(int x) {
        int sums = 0;
        if( x < 0)
        {
            int g = x * - 1;

            while( g > 0)
            {
                int r = g%10;
                if (sums * 10 >= Integer.MAX_VALUE / 3) {
                    sums = 0;
                }
                sums = sums*10 + r;
                g /= 10;
            }
            sums = sums * -1;
        }
        else
        {
            int g = x;
            int f = 0 ;
            while( g > 0) {
                int r = g % 10;
                if (sums * 10 >= Integer.MAX_VALUE / 3) {
                    sums = 0;
                }
                sums = sums * 10 + r;
                g /= 10;
            }

        }
        return sums;
    }
}
