package telusko.additional_progs;

import java.util.Scanner;

class Bicycle {
    int gear;
    int speed;
    String colour;

    Bicycle()
    {

    }

    Bicycle(int gear, int speed, String colour)
    {
        this.gear = gear;
        this.speed = speed;
        this.colour = colour;
    }

    public void applyBreak(int decrement)
    {
        speed -= decrement;
        System.out.println("Speed decreased to " + speed);
    }

    public void speedUp(int increment)
    {
        speed += increment;
        System.out.println("Speed increased to " + speed);
    }

    public boolean equals(Bicycle b)
    {
        if(gear == b.gear && colour.equals(b.colour))
        {
            return true;
        }

        return false;
    }
}

class MountainBike extends Bicycle {
    int height;

    MountainBike(int gear, int speed, String colour, int StartHeight)
    {
        super(gear,speed,colour);
        height = StartHeight;
    }
    public void setHeight(int newValue)
    {
        height = newValue;
    }
}

public class _2nd {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int gear, speed, height;
        String colour;

        MountainBike b1,b2;

        System.out.println("Enter the number of gears of first Mountain bike");
        gear = s.nextInt();
        System.out.println("Enter the speed of first Mountain Bike");
        speed = s.nextInt();
        System.out.println("Enter the colour of first Mountain bike");
        colour = s.next();
        System.out.println("Enter the height of first Mountain bike");
        height = s.nextInt();

        b1 = new MountainBike(gear,speed,colour,height);

        System.out.println();

        System.out.println("Enter the number of gears of second Mountain bike");
        gear = s.nextInt();
        System.out.println("Enter the speed of second Mountain Bike");
        speed = s.nextInt();
        System.out.println("Enter the colour of second Mountain bike");
        colour = s.next();
        System.out.println("Enter the height og second Mountain bike");
        height = s.nextInt();

        b2 = new MountainBike(gear,speed,colour,height);


        if(b1.equals(b2))
        {
            System.out.println("Similar Mountain bikes");
        }
        else
        {
            System.out.println("Non similar  Mountain bikes");
        }
    }
}