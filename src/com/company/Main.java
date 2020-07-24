package com.company;
import java.util.Scanner;

class Employee {
    String Firstname;
    String Lastname;
    double monthlySalary;

    public Employee(String f, String l, double sal) {
        Firstname =f;
        Lastname =l;
        if (sal<0){
            monthlySalary=0;
        }else
        monthlySalary=sal;
    }

    public String getFirstName(){
        return Firstname;
    }

    public void setFirstname(String FirstName){
        Firstname = FirstName;
    }

    public String getLastName() {
        return Lastname;}

    public void setLastName(String LastName) {
        Lastname = LastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double salary) {
        if (salary < 0) {
            monthlySalary =0;
        } else
            monthlySalary = salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String FirstName = sc.next();
        System.out.println("Enter the Last name: ");
        String LastName = sc.next();
        System.out.println("Enter the Salary: ");
        double Salary = sc.nextDouble();

        Employee e = new Employee(FirstName,LastName,Salary);
        System.out.println("Yearly salary of "+ e.getFirstName()+" "+e.getLastName()+" :");
        System.out.println(e.getMonthlySalary()*12);

        double newsalary=e.getMonthlySalary()*0.1+e.getMonthlySalary();
        e.setMonthlySalary(newsalary);
        System.out.println("New yearly salary of "+e.getFirstName()+" "+e.getLastName()+" :");
        System.out.println(e.getMonthlySalary()*12);
        e.getMonthlySalary();
    }
}
