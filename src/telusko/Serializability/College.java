package telusko.Serializability;

import java.util.ArrayList;
import java.util.List;

public class College
{
    private List<Student> s = new ArrayList<>();

    public List<Student> getS() {
        return s;
    }

    public void setS(List<Student> s) {
        this.s = s;
    }
}