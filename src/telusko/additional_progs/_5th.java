package telusko.additional_progs;

import java.util.Scanner;

abstract class Employee {
    private String firstName;
    private String lastName;
    private String emp_id;

    // three-argument constructor
    public Employee( String first, String last, String ssn )
    {
        firstName = first;
        lastName = last;
        emp_id = ssn;
    } // end three-argument Employee constructor

    // set first name
    public void setFirstName( String first )
    {
        firstName = first; // should validate
    } // end method setFirstName

    // return first name
    public String getFirstName()
    {
        return firstName;
    } // end method getFirstName

    // set last name
    public void setLastName( String last )
    {
        lastName = last; // should validate
    } // end method setLastName

    // return last name
    public String getLastName()
    {
        return lastName;
    } // end method getLastName

    // set social security number
    public void setEmp_id( String ssn )
    {
        emp_id = ssn; // should validate
    } // end method setSocialSecurityNumber

    // return social security number
    public String getEmp_id()
    {
        return emp_id;
    } // end method getSocialSecurityNumber

    // return String representation of Employee object
    @Override
    public String toString()
    {
        return String.format( "%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getEmp_id() );
    } // end method toString

    // abstract method overridden by concrete subclasses
    public abstract double earnings(); // no implementation here
}

class Commisioned_Emplyee extends Employee {

    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    // five-argument constructor
    public Commisioned_Emplyee( String first, String last, String ssn,
                                double sales, double rate )
    {
        super( first, last, ssn );
        setGrossSales( sales );
        setCommissionRate( rate );
    } // end five-argument CommissionEmployee constructor

    // set commission rate
    public void setCommissionRate( double rate )
    {
        if ( rate > 0.0 && rate < 1.0 )
            commissionRate = rate;
        else
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0" );
    } // end method setCommissionRate

    // return commission rate
    public double getCommissionRate()
    {
        return commissionRate;
    } // end method getCommissionRate

    // set gross sales amount
    public void setGrossSales( double sales )
    {
        if ( sales >= 0.0 )
            grossSales = sales;
        else
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0" );
    } // end method setGrossSales

    // return gross sales amount
    public double getGrossSales()
    {
        return grossSales;
    } // end method getGrossSales

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings()
    {
        return getCommissionRate() * getGrossSales();
    } // end method earnings

    // return String representation of CommissionEmployee object
    @Override
    public String toString()
    {
        return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate() );
    } // end method toString
}


class Base_salary_plus_commisssion_employee extends Commisioned_Emplyee {

    private double baseSalary; // base salary per week

    // six-argument constructor
    public Base_salary_plus_commisssion_employee( String first, String last,
                                                  String ssn, double sales, double rate, double salary )
    {
        super( first, last, ssn, sales, rate );
        setBaseSalary( salary ); // validate and store base salary
    } // end six-argument BasePlusCommissionEmployee constructor

    // set base salary
    public void setBaseSalary( double salary )
    {
        if ( salary >= 0.0 )
            baseSalary = salary;
        else
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0" );
    } // end method setBaseSalary

    // return base salary
    public double getBaseSalary()
    {
        return baseSalary;
    } // end method getBaseSalary

    // calculate earnings; override method earnings in CommissionEmployee
    @Override
    public double earnings()
    {
        return getBaseSalary() + super.earnings();
    }// end method earnings

    // return String representation of BasePlusCommissionEmployee object
    @Override
    public String toString()
    {
        return String.format( "%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary() );
    } // end method toString
}


class Salaried_Employee extends Employee {

    private double weeklySalary;

    // four-argument constructor
    public Salaried_Employee( String first, String last, String ssn,
                              double salary )
    {
        super( first, last, ssn ); // pass to Employee constructor
        setWeeklySalary( salary ); // validate and store salary
    } // end four-argument SalariedEmployee constructor

    // set salary
    public void setWeeklySalary( double salary )
    {
        if ( salary >= 0.0 )
            weeklySalary = salary;
        else
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0" );
    } // end method setWeeklySalary

    // return salary
    public double getWeeklySalary()
    {
        return weeklySalary;
    } // end method getWeeklySalary

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings()
    {
        return getWeeklySalary();
    } // end method earnings

    // return String representation of SalariedEmployee object
    @Override
    public String toString()
    {

        return String.format( "salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary" , getWeeklySalary() );
    } // end method toString
}


public class _5th {
    public static void main(String args[])
    {
        // create subclass objects
        String First_name, Last_name, emp_id;
        float salary, rate, sales;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter First name of Salaried Employee");
        First_name = s.next();
        System.out.println("Enter Last name of Salaried Employee");
        Last_name =s.next();
        System.out.println("Enter Employee id of salaried employee");
        emp_id =s.next();
        System.out.println("Enter salary of salaried employee");
        salary = s.nextFloat();

        Salaried_Employee salariedEmployee =
                new Salaried_Employee(  First_name,  Last_name ,  emp_id, salary );

        System.out.println("Enter First name of Commissioned Employee");
        First_name = s.next();
        System.out.println("Enter Last name of Commissioned Employee");
        Last_name =s.next();
        System.out.println("Enter Employee id of Commissioned employee");
        emp_id =s.next();
        System.out.println("Enter sales of Commissioned employee");
        sales = s.nextFloat();
        System.out.println("Enter percentage of sales being included in salary");
        rate = s.nextFloat();

        Commisioned_Emplyee commissionEmployee =
                new Commisioned_Emplyee(
                        First_name,  Last_name ,  emp_id, sales, rate);


        System.out.println("Enter First name of base Plus Commission Employee");
        First_name = s.next();
        System.out.println("Enter Last name of base Plus Commission Employee");
        Last_name =s.next();
        System.out.println("Enter Employee id of base Plus Commission employee");
        emp_id =s.next();
        System.out.println("Enter sales of base Plus Commission employee");
        sales = s.nextFloat();
        System.out.println("Enter percentage of sales being included in salary");
        rate = s.nextFloat();
        System.out.println("Enter salary of base Plus Commission employee");
        salary = s.nextFloat();



        Base_salary_plus_commisssion_employee basePlusCommissionEmployee =
                new Base_salary_plus_commisssion_employee(
                        First_name,  Last_name ,  emp_id, sales, rate, salary );

        System.out.println( "Employees processed individually:\n" );

        System.out.printf( "%s\n%s: $%,.2f\n\n",
                salariedEmployee, "earned", salariedEmployee.earnings() );

        System.out.printf( "%s\n%s: $%,.2f\n\n",
                commissionEmployee, "earned", commissionEmployee.earnings() );
        System.out.printf( "%s\n%s: $%,.2f\n\n",
                basePlusCommissionEmployee,
                "earned", basePlusCommissionEmployee.earnings() );

        // create four-element Employee array


    } // end main

}
