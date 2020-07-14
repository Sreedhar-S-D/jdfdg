package lambdas;

@FunctionalInterface
interface NumericFunc
{
    int func( int n);

}

public class first implements NumericFunc{
    @Override
    public int func(int n) {
        return 0;
    }

    public static void main(String[] args) {
        NumericFunc factorial;
        factorial = (n) -> {
            int result = 1;
            for( int i = 1 ; i<= n; i++)
            {
                result = result*i;
            }
            return result;
        };
        System.out.println("The factorial of 3 is :"+factorial.func(3));
        System.out.println();
    }
}
