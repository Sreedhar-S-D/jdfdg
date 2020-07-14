package telusko.additional_progs;

import java.util.Scanner;

public class _9th_2nd {
    public static boolean isStringOnlyAlphabet(String str)
    {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[a-zA-Z]*$")));
    }

    // Main method
    public static void main(String[] args)
    {

        // Checking for True case
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the string :");
        String getit = s1.next();
        System.out.print("The boolean value below  tells whether string contains only alphabets or not:\n");
        System.out.println("Output: " + isStringOnlyAlphabet(getit));

    }
}
