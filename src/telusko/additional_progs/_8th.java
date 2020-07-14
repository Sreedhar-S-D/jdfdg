package telusko.additional_progs;

import java.util.*;

public class _8th {

    public static void main(String[] args) {

        // Write a program thats ask for first names and store it in an array.

        String fName;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of names :");
        int number = input.nextInt();
        System.out.println("Enter the " + number + " of names one by one ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            System.out.print("Enter First Name: ");
            list.add(input.next());
        }
        System.out.println("Initial Array Elements :");
        System.out.printf("%s ", list);
        System.out.println();

        System.out.println("After removing duplicates method :");
        removeDuplicates(list);

        System.out.println();
        searchForName(list);
    }

    private static void removeDuplicates(Collection<String> values) {
        Set<String> set = new HashSet<String>(values);

        System.out.printf("%s ", set);

        System.out.println();

    }


    public static void searchForName(Collection<String> names) {

        String someName = "";

        Set<String> set = new HashSet<String>(names);
        Scanner input = new Scanner(System.in);
        System.out.print("Search a name: ");
        someName = input.nextLine();

        if (set.contains(someName)) {
            System.out.println("set contains name");

        } else {
            System.out.println("set doesn't contain this name");
        }
    }

}