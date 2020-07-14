import java.security.MessageDigest;
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
            hashValue = Dataypeconverter.print

        }
        catch (Exception e)
        {

        }
        return
    }



}
