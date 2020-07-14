package telusko.Serializability;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class xml_files {
    public static void main(String[] args) throws Exception{
        Student s1 = new Student();
        s1.setName("Mahesh");
        s1.setRollno(101);
        Student s2 = new Student();
        s2.setName("Ramesh");
        s2.setRollno(102);
        List<Student> n = new ArrayList<Student>();
        n.add(s1);
        n.add(s2);
        College c = new College();
        c.setS(n);
        XMLEncoder p = null;
        p = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("mycollege.xml")));
        p.writeObject(c);
        p.close();
    }
}

