package practise.collections;
import com.google.gson.internal.$Gson$Preconditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Pattern p = Pattern.compile("[^., ?!'@_]+");
        Matcher m = p.matcher(s);
        ArrayList<String> t = new ArrayList<>();
        int x = 0;
        while(m.find()) {
            x += 1;
            t.add(m.group());
        }
        System.out.println(x);
        t.forEach(System.out::println);
        scan.close();
    }
}
