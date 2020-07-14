package telusko.additional_progs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _9th_1st {
    public static long count(String s, char ch)
    {

        // Use Matcher class of java.util.regex
        // to match the character
        Matcher matcher
                = Pattern.compile(String.valueOf(ch))
                .matcher(s);

        int res = 0;

        // for every presence of character ch
        // increment the counter res by 1
        while (matcher.find()) {
            res++;
        }

        return res;
    }

    // Driver method
    public static void main(String args[])
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the text :");
        String str = s1.next();
        System.out.print("Enter the character to be found :");
        char c = s1.next().charAt(0);
        System.out.print("The following is the occurances of the character :");
        System.out.println(count(str, c));
    }
}
