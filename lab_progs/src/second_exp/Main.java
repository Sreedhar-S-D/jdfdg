package second_exp;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.print("\nPrint the number of objects do you want in each class :");
        int n = s1.nextInt();
        student s[] = new student[n];
        for( int i = 0; i < n; i++ )
        {
            System.out.printf("Student %d :\nEnter the details :",i+1);
            String USN,Name,City,State,Country;
            int streetnumber;
            System.out.print("\nEnter the name: ");
            Name = s1.next();
            System.out.print("\nEnter the USN: ");
            USN = s1.next();
            System.out.print("\nEnter the street number: ");
            streetnumber = s1.nextInt();
            System.out.print("\nEnter the city: ");
            City = s1.next();
            System.out.print("\nEnter the State: ");
            State = s1.next();
            System.out.print("\nEnter the Country: ");
            Country =  s1.next();
            s[i] = new student(USN,Name,new address(streetnumber,City,State,Country));

        }
        college c[] = new college[n];
        for( int i = 0; i < n; i++ )
        {
            System.out.printf("College %d :\nEnter the details :\n",i+1);
            String Name,City,State,Country;
            int streetnumber;
            System.out.print("\nEnter the name: ");
            Name = s1.next();
            System.out.print("\nEnter the street number: ");
            streetnumber = s1.nextInt();
            System.out.print("\nEnter the city: ");
            City = s1.next();
            System.out.print("\nEnter the State: ");
            State = s1.next();
            System.out.print("\nEnter the Country: ");
            Country =  s1.next();
            c[i] = new college(Name,new address(streetnumber,City,State,Country));

        }
        employee e1[] = new employee[n];
        for( int i = 0; i < n; i++ )
        {
            System.out.printf("Employee %d :\nEnter the details :",i+1);
            String Empid,City,State,Country,Name;
            int streetnumber;
            System.out.print("\nEnter the Empid: ");
            Empid = s1.next();
            System.out.print("\nEnter the Name: ");
            Name = s1.next();
            System.out.print("\nEnter the street number: ");
            streetnumber = s1.nextInt();
            System.out.print("\nEnter the city: ");
            City = s1.next();
            System.out.print("\nEnter the State: ");
            State = s1.next();
            System.out.print("\nEnter the Country: ");
            Country =  s1.next();
            e1[i] = new employee(Empid,Name,new address(streetnumber,City,State,Country));

        }
        System.out.println("\nNow printing details of students : \n");
        for( int i = 0; i< n; i++) {
            System.out.println("----------------------------------------------------------");
            System.out.printf("\nStudent %d details :", i + 1);
            System.out.printf("\nUSN : %s\nName : %s\nStreet number : %d\nCity : %s\nState : %s\nCountry : %s\n", s[i].USN, s[i].Name, s[i].addr.Streetnumber, s[i].addr.city, s[i].addr.State, s[i].addr.Country);
            System.out.println("----------------------------------------------------------");
        }

        System.out.println("\nNow printing details of colleges : \n");
        for( int i = 0; i< n; i++)
        {
            System.out.println("---------------------------------------------");
            System.out.printf(" College %d details :",i+1);
            System.out.printf("\nName : %s\nStreet number : %d\nCity : %s\nState : %s\nCountry : %s\n",c[i].Name,c[i].addr.Streetnumber,c[i].addr.city,c[i].addr.State,c[i].addr.Country);
            System.out.println("---------------------------------------------");

        }
        System.out.println("\nNow printing details of students : \n");
        for( int i = 0; i< n; i++)
        {
            System.out.println("----------------------------------------------------------");
            System.out.printf(" Employee %d details :",i+1);
            System.out.printf("\nEmpid : %s\nName : %s\nStreet number : %d\nCity : %s\nState : %s\nCountry : %s\n",e1[i].EmpID,e1[i].Name,e1[i].addr.Streetnumber,e1[i].addr.city,e1[i].addr.State,e1[i].addr.Country);
            System.out.println("----------------------------------------------------------");
        }
    }
}
