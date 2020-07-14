package telusko.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class _1{

    public static void main(String[] args) {

        String str = "ad, m, i.            n";

        String delimiters = "\\s+|,\\s*|\\.\\s*";

        // analyzing the string
        String[] tokensVal = str.split(delimiters);

        // prints the number of tokens
        for( String s : tokensVal)
        {
            System.out.println(s);
        }
        System.out.println("Count of tokens = " + tokensVal.length);

        for(String token : tokensVal) {
            System.out.print(token);
        }
    }
}
