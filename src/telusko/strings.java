package telusko;

public class strings {
    public static void main(String[] args) {
        String s1 = "Kay re bala , kay karat aahe tu";
        String s2 = "Kay re bala , kay karat aahe tu";
        if(s1.equals(s2)) {
            System.out.println("Tujha doka phirlo aahe ka");
        }
        student vone = new student(54,"Sreedhar");
        System.out.println(vone);
    }
}

class student
{
    int rollno;
    String name;

    public student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
