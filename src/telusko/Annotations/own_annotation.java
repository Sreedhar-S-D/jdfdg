package telusko.Annotations;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Smartphone
{
    String OS() default "Symbian";
    int version() default 1;
}

@Smartphone(OS = "Android",version = 10)
class NokiaASeries
{
    String model;
    int size;

    public NokiaASeries(String model, int size)
    {
        this.model = model;
        this.size = size;
    }
}


public class own_annotation {
    public static void main(String[] args) {
        NokiaASeries obj = new NokiaASeries("Fire",6);
        Class c= obj.getClass();
        Annotation an = c.getAnnotation(Smartphone.class);
        Smartphone s = (Smartphone)(an);
        System.out.println(s.OS());
    }
}
