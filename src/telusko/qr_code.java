//package telusko;
//
//import net.glxn.qrgen.QRCode;
//import net.glxn.qrgen.image.ImageType;
//
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.File;
//import java.io.FileOutputStream;
//
//public class qr_code {
//    public static void main(String[] args) throws Exception {
//        String details = " Hello my name is Sreedhar ";
//        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.PNG).stream();
//        File f = new File("C:\\ANN\\Myname.png");
//        FileOutputStream fos = new FileOutputStream(f);
//        fos.write(out.toByteArray());
//        fos.flush();
//        fos.close();
//    }
//}
