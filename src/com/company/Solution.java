package com.company;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        String s = scan.nextLine();
//        s += scan.nextLine();
//        // Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//          int[][] a = {{1, 2, 3}, {4, 5, 6}};
//          char nptel[] = {'N','P','T','E','L'};
//System.out.println(""+nptel[0]+nptel[nptel.length-1]);
        int count = 0;
        for( int i = 1; i < 3 ; i+=3)
        {
            count+=1;
            System.out.println(count+"value of i before was "+i+"\nNow its:");
            System.out.print(--i);
        }

    }
}
