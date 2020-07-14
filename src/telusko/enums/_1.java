
package telusko.enums;


enum Mobile
{
    APPLE(1000),SAMSUNG(700),XIAOMI(650);
    int price;
    Mobile()
    {
        price = 800;
        System.out.println("Hello a new mobile brand.");
    }
    Mobile(int num)
    {
        price = num;
    }
    public int getPrice()
    {
        return this.price;
    }
}
public class _1 {
    public static void main(String[] args) {
        System.out.println(Mobile.APPLE.getPrice());
    }
}
