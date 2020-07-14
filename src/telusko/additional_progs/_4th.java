package telusko.additional_progs;

import java.util.Scanner;

interface StackInt {
    void push(int item);
    int pop();
}

class Stack implements StackInt {

    int length;
    int stk[];
    int top;

    Stack()
    {
        length = 0;
        top = -1;
    }


    Stack(int cap)
    {
        length = cap;
        top = -1;

        stk = new int[length];
    }
    public void push(int item)
    {
        if(length - 1 == top)
        {
            int t[] = new int[length * 2];

            for(int i = 0; i <= top; i++)
            {
                t[i] = stk[i];
            }

            stk = t;

            stk[++top] = item;

            length =  2* length;

        }
        else
            stk[++top] = item;
    }


    public int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflows ");
            return -1;
        }
        else
            return stk[top--];
    }

    public void print()
    {
        if(top == -1)
        {
            System.out.println("Empty Stack");
            return;
        }
        System.out.print("[");

        for(int i = 0;i <= top; i++)
        {
            System.out.print(stk[i] + " ");
        }

        System.out.println("]");
    }
}

public class _4th {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int capacity, ch, x;
        Stack st;

        System.out.println("Enter the initial capacity of the stack");
        capacity = s.nextInt();

        st = new Stack(capacity);


        while(true)
        {
            System.out.print("Choices:\n1. Push\n2. Pop \n3. Print Stack\n4. exit\n");
            System.out.println("Enter your choice");
            ch = s.nextInt();

            switch (ch)
            {
                case 1: System.out.println("Enter the item to be pushed");
                    x = s.nextInt();
                    st.push(x);
                    System.out.println(st.length);

                    break;

                case 2: System.out.println("Popped Element: " + st.pop());
                    break;

                case 3: st.print();
                    break;

                case 4: return;

                default: System.out.println("Invalid choice");
                    break;
            }

        }
    }
}
