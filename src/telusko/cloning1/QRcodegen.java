//package telusko.cloning1;
//
//import java.io.*;
//
//import net.glxn.qrgen.QRCode;
//import net.glxn.qrgen.image.ImageType;
//
//public class QRcodegen {
//    public static void main(String[] args) throws Exception{
//        String details = "Sreedhar Dhulkhed 1RV18CS171";
//        ByteArrayOutputStream br = QRCode.from(details).to(ImageType.PNG).stream();
//        File f = new File("F:\\newimage.png");
//        FileOutputStream fos = new FileOutputStream(f);
//        fos.write(br.toByteArray());
//        fos.flush();
//    }
//}
