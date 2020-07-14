package lambdas;

//clubbing both the factorial and the string reversal
@FunctionalInterface
interface SomeFunc<T>{
    T func(T t);
}

public class GenericFuncitoninterface implements  SomeFunc {


    @Override
    public Object func(Object o) {
        return null;
    }

    public static void main(String[] args) {

        SomeFunc<String> reverse;
        reverse = (str) -> {
            String result = "";
            int i;
            for( i = str.length()-1;i>=0;i--)
                result += str.charAt(i);
            return result;
        };
        SomeFunc<Integer> factorial;
        factorial = (n) -> {
            int result = 1;
            for( int i = 1 ; i<= n; i++)
            {
                result = result*i;
            }
            return result;
        };
        System.out.println("lambda reverses is "+reverse.func("Chapter"));
        System.out.println("The factorial of 3 is :" + factorial.func(3));
        SomeFunc<String> reverse2;
        reverse2 = (str) -> {
            String result = "";
            int i;
            for( i = str.length()-1;i>=0;i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("lambda reverses is "+reverse2.func("Get Lost"));
    }
}
