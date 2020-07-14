package week_3;

public class Test1 extends Shape {
    //Create a derived class constructor which can call the one parametrized constructor of the base class
//Create a derived class constructor which can call the two parametrized constructor of the base class
//Override the method calculate() in the derived class to find the volume of a shape instead of finding the area of a shape
    double height;

    public Test1(double l, double b) {
        super(l, b);
    }
    public Test1(double l, double b,double h) {
        super(l, b);
        height = h;
    }

    @Override
    double calculate() {
        return super.calculate()*height;
    }
}
