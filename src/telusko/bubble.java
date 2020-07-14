package telusko;

import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        num obj[] = new num[10];
        for( int i = 0; i<10;i++) {
            obj[i] = new num();
        }
        System.out.println("enter the 10 elements : ");
        Scanner s1 = new Scanner(System.in);
        for( int i=0 ; i< 10;i++)
        {
            int x = s1.nextInt();
            obj[i].number = x;
        }
        for (int i = 0; i < 10 - 1; i++) {
            for (int j = 0; j < 10 - 1 - i; j++) {
                if (obj[j].number > obj[j+1].number) {
                   swap(obj[j],obj[j+1]);
                }
            }
        }
        System.out.println(" here is the sequence");
        for( int i = 0 ; i<10 ;i++)
        {
            System.out.println(obj[i].number);
        }

        }
        public static void swap( num one, num two)
        {
            int temp = one.number;
            one.number = two.number;
            two.number = temp;
        }
    }


class num
{
    int number;
}
