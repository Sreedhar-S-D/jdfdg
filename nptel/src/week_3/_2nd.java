package week_3;

import javafx.scene.shape.Circle;

import java.util.Scanner;

public class _2nd {
    public static void main(String[] args) {
//        c1.distance(c, p);  //Calcualte radius of the circle
//        c1.distance(c, p);  //Calcualte radius of the circle
//        c1.distance(c, p);  //Calcualte radius of the circle
//        c1.distance(c, p);  //Calcualte radius of the circle
//        c1.distance(c, p);  //Calcualte radius of the circle
//        c1.distance(c, p);  //Calcualte radius of the circle
//        c1.distance(c, p);  //Calcualte radius of the circle
//        c1.distance(c, p);  //Calcualte radius of the circle
//        c1.distance(c, p);  //Calcualte radius of the circle
//        c1.distance(c, p);  //Calcualte radius of the circle
//        c1.distance(c, p);  //Calcualte radius of the circle
//        c1.distance(c, p);  //Calcualte radius of the circle
    }
}

class Point
{
    double x,y;
    public double distance( Point c, Point p)
    {
        System.out.println();
        return(double)( Math.sqrt( Math.pow((c.x - p.x),2) + Math.pow((c.y - p.y),2)  ));
    }
}