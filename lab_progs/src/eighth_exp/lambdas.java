package eighth_exp;


import com.google.gson.internal.bind.util.ISO8601Utils;

import java.math.BigInteger;
import java.util.Scanner;

interface doing
{
    int does(int a);
}

class operations
{
    doing IsODD()
    {
        doing r = (a) -> {return (a%2);};
        return r;

    }
    doing IsPRIME()
    {

        doing r = (a) ->
        {
            String f = String.valueOf(a);
            BigInteger m = new BigInteger(f);
            boolean b = m.isProbablePrime(1);
            int x =(b==true)?1:0;
            return x;
        };
        return r;
    }
    doing IsPalindrome()
    {
        doing r = (a) ->
        {
            String g = String.valueOf(a);
            StringBuilder input1 = new StringBuilder();

            // append a string into StringBuilder input1
            input1.append(g);

            // reverse StringBuilder input1
            String b = input1.reverse().toString();
            int f = b.equals(g)?1:0;
            return f;

        };
        return r;

    }

}


public class lambdas {
    public static void main(String[] args) {
        operations k = new operations();
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Odd\n2.Prime\n3.Palindrome");
            int d = s.nextInt();
            switch (d)
            {
                case 1:{
                    System.out.println("Enter the number :");
                    int w = s.nextInt();
                    doing h = k.IsODD();
                    int f = h.does(w);
                    String m = (f==1)?"YES":"NO";
                    System.out.println(m);
                    break;

                }
                case 2:{
                    System.out.println("Enter the number :");
                    int w = s.nextInt();
                    doing h = k.IsPRIME();
                    int f = h.does(w);
                    String m = (f==1)?"YES":"NO";
                    System.out.println(m);
                    break;

                }
                case 3:{
                    System.out.println("Enter the number :");
                    int w = s.nextInt();
                    doing h = k.IsPalindrome();
                    int f = h.does(w);
                    String m = (f==1)?"YES":"NO";
                    System.out.println(m);
                    break;

                }
                default:{
                    System.out.println("\nEnter a valid number !!\n ");
                }
            }
        }
    }
}
