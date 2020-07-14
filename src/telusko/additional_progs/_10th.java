package telusko.additional_progs;

import java.util.Arrays;
import java.util.Scanner;

public class _10th {
    static int NO_OF_CHARS = 256;

    /* function to check whether characters
    of a string can form a palindrome */
    static boolean canFormPalindrome(String str) {

        // Create a count array and initialize all
        // values as 0
        int count[] = new int[NO_OF_CHARS];
        for( int i = 0 ; i< count.length;i++)
        {
            count[i] = 0;
        }

        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (int i = 0; i < str.length(); i++)
            count[(int)(str.charAt(i))]++;

        // Count odd occurring characters
        int odd = 0;
        for (int i = 0; i < NO_OF_CHARS; i++)
        {
            if ((count[i] & 1) == 1)
                odd++;

            if (odd > 1)
                return false;
        }

        // Return true if odd count is 0 or 1,
        return true;
    }

    // Driver program
    public static void main(String args[])
    {
        System.out.print("Enter the string and check whether it can form palindrome on rearranging :");
        if (canFormPalindrome(new Scanner(System.in).next()))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
