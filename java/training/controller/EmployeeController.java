package com.java.training.controller;
import com.java.training.service.EmployeeService;
import com.java.training.Repository.EmployeeRepository;

public class EmployeeController {
EmployeeService employeeService=new EmployeeService();

    public void createEmployee(String name, int age, int salary, int empId)
    {
        employeeService.createEmployee(name,age,salary,empId);

    }
    public void listEmployee(){
        employeeService.listEmployee();
    }
    public void deleteEmployee(int deleteId){
        employeeService.deleteEmployee(deleteId);
    }
    public void updateEmployee(int updateId){
        employeeService.updateEmployee(updateId);
    }

}
