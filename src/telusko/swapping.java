package telusko;

import java.util.ArrayList;
import java.util.Arrays;

public class swapping {
    public static void main(String[] args) {
        Integer x = 3;
        Integer y = 4;
        swap(x,y);
        System.out.println(x + " " + y);

    }
    public static void swap(Integer x, Integer y)
    {
        x = x + y;
        y = x - y;
        x = x - y;
    }
}


