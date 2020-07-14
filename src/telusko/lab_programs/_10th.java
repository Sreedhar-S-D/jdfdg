package telusko.lab_programs;

import java.util.Scanner;
import java.util.Spliterator;

interface a
{
    public void g();
}

public class _10th {
    public static void main(String[] args) {
        //1st part
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = in.nextLine();
        String[] words = line.split("[ ]+");
        System.out.println("Penultimate word: "+words[words.length-2]);

        //2nd part
        String str = "My name is Python";
        String rs = str.replace("Python", "Java"); // Replace 'Python' with 'Java'
        System.out.println(rs);
        rs = rs.replace("Java", "Python"); // Replace 'Java' with 'Python'
        System.out.println(rs);

        //3rd part
        String s = " ,ab;gh,bc;pq#kk$bb";
        String[] str1 = s.split("[,;#$]");

        //Total how many substrings? The array length
        System.out.println("Number of substrings: "+str1.length);

        for (int i=0; i < str1.length; i++) {
            System.out.println("Str[" + i + "]:" + str1[i]);
        }
        a k = () -> {

            System.out.println("Interfaces are so good for design model .");
            System.out.println("What is the need of a return statement" );
            System.out.println("We are in the need of a better theatre");
            System.out.println("No this is the wrong way to tell that all of us have the same fate");

        };
        k.g();
        System.out.println("This may not work but it did so !!");
    }
}
