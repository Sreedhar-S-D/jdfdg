package telusko.files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class first {
    public static void main(String[] args) throws Exception {
        FileOutputStream fs = new FileOutputStream("F:\\demo.txt");
        DataOutputStream ds = new DataOutputStream(fs);
        ds.writeUTF("Hello ");

        FileInputStream fos = new FileInputStream("F:\\demo.txt");
        DataInputStream dos = new DataInputStream(fos);
        String str = dos.readUTF();
        System.out.println(str);
    }
}
