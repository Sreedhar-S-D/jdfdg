package telusko;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class nayaio
{
    public static void main(String[] args) throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        int x = Integer.parseInt(br.readLine());
        System.out.println(x);

    }
}
