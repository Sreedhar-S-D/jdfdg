package telusko.practise;

import java.util.Scanner;
import java.util.Stack;


public class Stacking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input=sc.next();
            Stack<Character> p = new Stack<>();
            for( int i = 0 ; i < input.length(); i++)
            {
                if(input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{' )
                    p.push(input.charAt(i));
                else if((input.charAt(i) == ')' ) &&(p.peek()=='('))
                {
                    for( int j = 0 ; j<2 ; j++)
                    {
                        p.pop();
                    }
                }
                else if((input.charAt(i) == ']' ) &&(p.peek()=='['))
                {
                    for( int j = 0 ; j<2 ; j++)
                    {
                        p.pop();
                    }
                }
                else if((input.charAt(i) == '}' ) &&(p.peek()=='{'))
                {
                    for( int j = 0 ; j<2 ; j++)
                    {
                        p.pop();
                    }
                }

            }
            if(p.empty())
                System.out.println(true);
            else
                System.out.println(false);
        }


    }
}
