package third_exp;

public class Cylinder extends Circle{
    double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getArea()
    {
        return height*super.getArea();
    }

    public double getHeight() {
        return height;
    }

    public double getVolume()
    {
        return super.getArea()*super.radius*this.height;
    }

}
