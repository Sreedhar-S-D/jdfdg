package telusko.cloning1;

public class first {
    public static void main(String[] args) throws CloneNotSupportedException{
        abc n = new abc();
        n.i = 4;
        n.j = 6;
        abc m = (abc)n.clone();
        System.out.println(m);
    }

}

class abc implements Cloneable
{
    int i;
    int j;

    @Override
    public String toString( ) {
        return i + " " + j;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}