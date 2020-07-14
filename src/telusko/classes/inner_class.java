package telusko.classes;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

public class inner_class {
    public static void main(String[] args) {
        B obj = new B(){
          public void show()
          {
              System.out.println("kya hai re");
          }
        };

    }
}

class B
{
    B()
    {
        System.out.println("Animal");
    }
}
class C extends B{
    C()
    {
        System.out.println("Wild");

    }
}