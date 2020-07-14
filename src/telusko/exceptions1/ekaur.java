package telusko.exceptions1;


class Refer
{
    static int a = 1;
}

class Answer extends Refer
{
    static int a = 2;
}


public class ekaur extends Answer
{

    public static void main(String[] args)
    {
        a = 5;
        System.out.println(Answer.a);
        System.out.println(Refer.a);
    }

}
