package telusko.currentTime;

public class _1 {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        for( int i = 0 ; i<=1999999999;i++);
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }

}
