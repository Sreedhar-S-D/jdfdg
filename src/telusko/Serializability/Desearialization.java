package telusko.Serializability;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class Desearialization {
    public static void main(String[] args) throws FileNotFoundException{

            XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("mycollege.xml")));
            College c = (College)x.readObject();
            List<Student> s = c.getS();
            for( Student value : s)
            {
                System.out.println(value.toString());
            }

    }
}
