package lambdas;

interface  StringFun2 {
    String func(String n);
}

public class Blocklambda {
    public static void main(String[] args) {
       StringFun2 reverse;
       reverse = (str) -> {
           String result = "";
           int i;
           for( i = str.length()-1;i>=0;i--)
               result += str.charAt(i);
           return result;
       };
        System.out.println("lambda reverses is "+reverse.func("Chapter"));

    }
}
