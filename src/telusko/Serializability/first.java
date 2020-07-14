package telusko.Serializability;

import java.io.*;

public class first {
    public static void main(String[] args) throws Exception {
        Serial d = new Serial(4);
        FileOutputStream fos = new FileOutputStream("data.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);

        FileInputStream ff = new FileInputStream("data.txt");
        ObjectInputStream oo = new ObjectInputStream(ff);
        Serial n = (Serial)oo.readObject();
        System.out.println("The value of the value of the variable is : " + n.i);
    }
}

class Serial implements Serializable
{
    int i;

    public Serial(int i) {
        this.i = i;
    }
}