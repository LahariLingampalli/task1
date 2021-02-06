package com.java.training.service;
import Employee.com.Employee;
import com.java.training.model.EmployeeModel;
import com.java.training.Repository.EmployeeRepository;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
    EmployeeRepository employeeRepository=new EmployeeRepository();
private static Scanner scanner=new Scanner(System.in);
    public static void createEmployee(String name, int age, int salary, int empId) {
    }

    public void creatEmployee(String Name, int Age, int Salary, int EmpId)
    {
        Employee employee=new Employee(Name,Age,Salary,EmpId);
        employee.setName(Name);
        employee.setAge(Age);
        employee.setSalary(Salary);
        employee.setEmpId(EmpId);

        employeeRepository.saveEmployee(employee);
    }
List<Employee> employeeList=employeeRepository.listEmployees();

    public void listEmployee() {
    }

    public void deleteEmployee(int deleteId) {
        for (Employee employee: employeeList)
            if(employee.getId()==deleteId)employeeList.remove(employee);
    }

    public void updateEmployee(int updateId) {


        for(Employee employee:employeeList)
            if(employee.getId()==updateId){
                System.out.println("Enter to update name: ");
                String name= scanner.next();
                System.out.println("Enter to update Age: ");
                int age=scanner.nextInt();
                System.out.println("Enter to update salary: ");
                int salary=scanner.nextInt();

            }
    }
}
