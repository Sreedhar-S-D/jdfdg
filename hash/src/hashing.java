
import java.security.MessageDigest;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;


public class hashing {

    public static String gethash( byte[] inputbytes , String Algorithm )
    {
        String hashValue = "";
        try
        {
            MessageDigest messageDigest = MessageDigest.getInstance(Algorithm);
            messageDigest.update(inputbytes);
            byte[] digestedbyte = messageDigest.digest();
            hashValue = DatatypeConverter.printHexBinary(digestedbyte).toLowerCase();


        }
        catch (Exception e)
        {

        }
        return hashValue;
    }
//    public static void main (String[] args)
//    {
//        String somestring = "This is some string .";
//        System.out.println("\nFollowing was the string :"+somestring+"\nthis is the hashValue:");
//        System.out.println(gethash(somestring.getBytes(),"SHA-512"));
//    }
public static void main(String[] args) {
//    Scanner n = new Scanner(System.in);
//    System.out.println(args[5]);
    int a = 8;
    char b = '2';
    System.out.println(a+b);
}


}