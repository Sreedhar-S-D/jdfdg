package telusko;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class propertyfile
{
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        FileOutputStream os = new FileOutputStream("dataConfig.properties");
        p.setProperty("url", "localhost:3306/myDb");
        p.setProperty("name", "Sreedhar");
        p.setProperty("pass", "0000");
        p.store(os,null);

        FileInputStream fs = new FileInputStream("dataConfig.properties");
        p.load(fs);
        p.list(System.out);
    }
}
