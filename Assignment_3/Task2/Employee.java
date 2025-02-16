package Task2;

import java.util.Scanner;

public class Employee {
    String employeeID;
    String name;
    int salary;
    int experience;
    Scanner scanner = new Scanner(System.in);
    public Employee(String employeeID, String name, int salary, int experience) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
    
    public Employee() {
    }

    public String getEmployeeID() {
        return employeeID;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public int getExperience() {
        return experience;
    }
    public void setEmployeeDetails(){
        System.out.println("Enter Employee Name : ");
        name=scanner.nextLine();
        System.out.println("Enter Employee ID : ");
        employeeID=scanner.nextLine();
        System.out.println("Enter Salary");
        salary=scanner.nextInt();
        System.out.println("Enter Experience : ");
        experience=scanner.nextInt();
        System.out.println("Employee Added");
    }
    public void getEmployeeDetails(Employee employee){
        System.out.println("Name : "+name);
        System.out.println("ID : "+employeeID);
        System.out.println("Salary : "+salary);
        System.out.println("Experience : "+experience);
    }
    public void loanEligibility(){
        if(experience<=5){
            System.out.println("Not Eligible");
            return;
        }
        if(salary>=1500000){
            System.out.println("7 lakhs loan granted");
            return;
        }
        else if(salary>=1000000){
            System.out.println("5 lakhs loan granted");
            return;
        }
        else if(salary==600000){
            System.out.println("2 lakhs loan granted");
            return;
        }
        System.out.println("Not Eligible");
    }
    public static void main(String[] args) {
        Employee employee1 = new Employee("1", "Ramesh", 10000000, 10);
        employee1.loanEligibility();
    }
}
