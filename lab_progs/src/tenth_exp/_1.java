package tenth_exp;

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {

        //1st
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String[] n = s1.split(" ");
        System.out.println(n[n.length -2]);

        //2nd
        String s2 = s.nextLine();
        String[] words = s2.split(" ");
        for( int i = 0 ; i< words.length;i++)
        {
            if(words[i].equals("python"))
                words[i] = "java";
            else if(words[i].equals("java"))
                words[i] = "python";
        }
        System.out.println("\nThe new array is : ");
        for( String z : words)
        {
            System.out.println(z);
        }
        String new1 = String.join(" ",words);
        System.out.println(new1);

        //3rd
        String s3 = s.nextLine();
        System.out.println("The string split at the spaces is :");
        for( String z : s3.split(" "))
        {
            System.out.println(z);
        }

    }
}
