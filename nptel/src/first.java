import java.util.Scanner;

public class first {

    public static void main(String[] args) {

        System.out.println(args[5]);
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();
        double perimeter = 0;
        double area = 0;
        if (radius<=0)
        {
            System.out.println("please enter non zero positive number");
        }
        else
        {
            perimeter = Math.PI * radius * 2;
            area = Math.PI * Math.pow(radius,2);
            System.out.println(perimeter);
            System.out.println(area);
        }
    }
}
