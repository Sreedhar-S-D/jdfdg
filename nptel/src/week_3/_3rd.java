package week_3;

public class _3rd
{
    public static void main(String[] args) {

    }
}

class Shape{
    double length, breadth;
    Shape(double l, double b){ //Constructor to initialize a Shape object
        length = l;
        breadth= b;
    }
    Shape(double len){    //Constructor to initialize another Shape object
        length = breadth = len;
    }
    double calculate(){  // To calculate the area of a shape object
        return length * breadth ;
    }
}


