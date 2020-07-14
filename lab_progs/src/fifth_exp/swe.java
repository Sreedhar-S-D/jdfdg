package fifth_exp;


interface Animal
{
    void eat();
    void sleep();
}

class Lion implements Animal
{
    @Override
    public void eat() {
        System.out.println("I eat wilderbeasts");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep almost everyday");

    }
}

class Snake implements Animal
{
    @Override
    public void eat() {
        System.out.println("I eat rats");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep rarely");
    }
}
public class swe {
    public static void main(String[] args) {
        Animal j = new Lion();
        Animal g = new Snake();
        j.eat();
        j.sleep();
        g.eat();
        g.sleep();
    }
}
