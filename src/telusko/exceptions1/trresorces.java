package telusko.exceptions1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class trresorces  {
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))// over here since we have only one catch we can declare the object within the try block.
        {
            int str = Integer.parseInt(br.readLine());
        }
        catch (Exception e)
        {
            System.out.println("Some exception");
        }
    }
}
