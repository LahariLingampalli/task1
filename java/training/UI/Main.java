
package com.java.training.UI;
import Employee.com.Employee;
import com.java.training.controller.EmployeeController;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    private static  Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        EmployeeController employeController = new EmployeeController();
        System.out.println("Enter Employee Details");
        System.out.println("Enter Employee Name: ");
        String Name = sc.next();
        System.out.println("Enter Employee Age: ");
        int Age = sc.nextInt();
        System.out.println("Enter Employee Salary: ");
        int Salary = sc.nextInt();
        System.out.println("Enter Employee ID");
        int EmpId = sc.nextInt();
        employeController.createEmployee(Name, Age, Salary, EmpId);

    }
    employeeController.listEmployee();

    {
        System.out.println("Enter delete EmpId");
        int deleteId = sc.nextInt();
        employeeController.listEmployee(deleteId);
    }
    {
    System.out.println("Update Details");
    int updated = sc.nextInt();
    employeeController.updateEmployee(updateId);
    employeeController.listEmployee();
    }
public static void printInfo(){
    System.out.println("choose your choice");
    System.out.println("1.Create employee details");
    System.out.println("2.List of  employee details");
    System.out.println("3.Update the employee details");
    System.out.println("4.Delete employee details");

}
}
