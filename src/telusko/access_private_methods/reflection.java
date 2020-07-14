package telusko.access_private_methods;

import java.lang.reflect.Method;

// reflection API
public class reflection {
    public static void main(String[] args) throws Exception{

        Class c = Class.forName("telusko.access_private_methods.Test");
        Test t = (Test)c.newInstance();
        Method m = c.getDeclaredMethod("show",null);
        m.setAccessible(true);
        m.invoke(t,null);
    }
}
