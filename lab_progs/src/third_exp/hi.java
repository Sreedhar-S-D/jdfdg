package third_exp;

public class hi {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(3,5);
        Cylinder c2 = new Cylinder(3 , "Green",5);
        if((c1.height == c2.height) && (c1.radius == c2.radius) && (c1.color == c2.color))
        {
            System.out.println("Go to sleep man");
        }

    }
}
