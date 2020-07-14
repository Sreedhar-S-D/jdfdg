package telusko.lab_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Spliterator;
import java.util.stream.Stream;

class ALOper{
        ArrayList<String> list_Strings = new ArrayList<String>();
        ArrayList<String> revArrayList = new ArrayList<String>();


        public void addList()
        {
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println(list_Strings);
        }

        public void toArr() {
            String strArr[] = new String[list_Strings.size()];
            list_Strings.toArray(strArr);
            System.out.println("Created Array content:");
            for (String str : strArr) {
                System.out.println(str);
            }
        }
        void reverseArrayList() {
        // Arraylist for storing reversed elements
        ArrayList<String> revArrayList = new ArrayList<String>();
        for (int i = list_Strings.size() - 1; i >= 0; i--) {

        // Append the elements in reverse order
        revArrayList.add(list_Strings.get(i));
        }
        for (int i = 0; i < revArrayList.size(); i++) {
        System.out.print(revArrayList.get(i) + " ");
        }

        }
        public void subListArr()
        {
        //Return portion of the list : fromindex(inclusive)->1,
        //toindex(exclusive)->3
        ArrayList<String> new_color_list1 = new
        ArrayList<String>( list_Strings.subList(1, 3));
        System.out.println("Portion of the list: +new_color_list1");

        }

        public void sortArr()
        {
        Collections.sort(list_Strings);
        System.out.println(list_Strings);

        }

        public void cloneArr()
        {
        ArrayList<String> cloneList = (ArrayList<String>)
        list_Strings.clone();
        System.out.println("Elements in cloneList are:");
        System.out.println(cloneList);
        }

}


public class _9th {
    public static void main(String[] args) {

        ALOper al = new ALOper();
        al.addList();
        al.toArr();
        al.reverseArrayList();
        al.subListArr();
        al.sortArr();
        al.cloneArr();
        Stream<String> str1 = al.list_Strings.stream();
//        Spliterator<String> f = str1.spliterator();
//
//        Spliterator<String> splitr2 = f.trySplit();
//        System.out.println(f.characteristics());
//        System.out.println(splitr2.characteristics());
//        System.out.println(f.estimateSize());
//        System.out.println(splitr2.estimateSize());
//        System.out.println(f.getExactSizeIfKnown());
//        System.out.println(splitr2.getExactSizeIfKnown());
//        System.out.println(f.tryAdvance((n) -> System.out.println("What is this ?"+ n)));
//        f.forEachRemaining(System.out::println);
//        splitr2.forEachRemaining(System.out::println);

    }}

