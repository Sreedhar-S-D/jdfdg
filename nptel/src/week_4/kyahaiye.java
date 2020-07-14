package week_4;

import java.util.Scanner;

public class kyahaiye {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // Read as string, e.g., 5+6
        char[] charArray = input.toCharArray();
        char op = charArray[1];
        double a = (double)(charArray[0] - '0');
        double b = (double)(charArray[2] - '0');

        if(op == '+') {
            double p = a+b;
            System.out.println(input + " = " + Math.round(p));
        }
        else if(op == '-') {
            double p = a-b;
            System.out.println(input + " = " + Math.round(p));
        }
        else if(op == '*') {
            double p = a*b;
            System.out.println(input + " = " + Math.round(p));
        }
        else if(op == '/') {
            double p = a/b;
            System.out.println(input + " = " + Math.round(p));
        }
        else {
            double p = a%b;
            System.out.println(input + " = " + Math.round(p));
        }

    }
}