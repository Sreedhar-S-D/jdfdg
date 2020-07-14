package telusko.exceptions1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class one
{
    public static void main(String[] args) {
        BufferedReader b = new BufferedReader( new InputStreamReader(System.in));
        int i = 2;
        int[] a = new int[4];
        try{
            int j = Integer.parseInt(b.readLine());
            int k = i+j;
            if(k<10)
            {
                throw new Myexception();
            }
            System.out.println("k value is :" + k);
            for (int u=0;u<=4;u++)
            {
                System.out.println(a[u]);
            }

        }
        catch( IOException e)
        {
            System.out.println("Some IO error");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Some error in array indexing");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Answer to be greater than 10 ");
        }
        catch (Myexception e)
        {

        }
        catch (Exception e)
        {
            System.out.println("Nothing is to be done ");
        }

        finally {
            System.out.println(" Are you done with your tantrums ?");
        }
    }

}
class Myexception extends Exception
{
    Myexception()
    {
        System.out.println(" no no no this is not possible ");
    }

}
