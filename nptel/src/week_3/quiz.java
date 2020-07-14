package week_3;

public class quiz {
    private static int i = 0;
    private static int j = 0;

    public static void main(String[] args) {
        String question = "Which course have you opted ?";
        System.out.println(Answer.submit(question));

    }
}
class Answer
{
    static String answer = "Programming with Java";
    static String submit(String question)
    {
        return ("The asnwer to the question "+question+" is "+answer);
    }
}
