package telusko.Threading;
public class first {
    public static void main(String[] args) throws Exception{

        Thread t1 = new Thread(() ->
        {
        for( int i =0 ; i<5;i++) {
            System.out.println("Hi " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        },"First");
        Thread t2 = new Thread(() ->
        {
            for( int i =0 ; i<5;i++) {
                System.out.println("Hello "+ Thread.currentThread().getPriority());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Second");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getName());
        System.out.println(t2.getName());



        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye");

    }
}
