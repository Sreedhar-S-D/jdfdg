package telusko.interfaces1;

interface Abc
{
    void show();
}
//
//class ABC implements Abc
//{
//    public void show()
//    {
//        System.out.println("Kay re");
//    }
//}


public class first {
    public static void main(String[] args) {
        Abc obj = () ->System.out.println("in show");
        obj.show();
    }

}
