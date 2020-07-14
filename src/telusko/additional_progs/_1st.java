package telusko.additional_progs;

import java.util.Scanner;

class Student
{
    String usn, name, branch, phone;
    Student(String usn, String name, String branch, String phone)
    {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }

    public void display()
    {
        System.out.println("USN: "+usn+"\nName: "+name+"\nBranch: "+branch+"\nPhone: "+phone);
    }
}

public class _1st
{
    public static void main(String[] args)
    {
        int n;
        String usn, name, branch, phone;
        Scanner s1 = new Scanner(System.in);
        System.out.println("How many students? ");
        n = s1.nextInt();
        Student s[] = new Student[n];
        System.out.println("Enter the students' details (USN, Name, Branch and Phone Number):");
        for(int i = 0; i < n; i++)
        {
            System.out.println("Student " + (i + 1));
            usn = s1.next();
            name = s1.next();
            branch = s1.next();
            phone = s1.next();
            s[i] = new Student(usn,name,branch,phone);
        }
        System.out.println("Printing students' details:");
        for(int i = 0; i < n; i++)
        {
            System.out.println("Student " + (i + 1));
            s[i].display();
        }
    }
}