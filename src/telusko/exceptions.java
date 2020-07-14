package telusko;

public class exceptions {
    public static void main(String[] args) {
        int i, j, k;
        i = 0;
        j = 6;
        try
        {
            k = j/i;
        }
        catch ( Exception r)
        {
            System.out.println(r + " this means what you have done is prohibited");
        }

    }
}
