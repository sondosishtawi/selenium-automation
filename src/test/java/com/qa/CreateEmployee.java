package com.qa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.errorprone.annotations.ThreadSafeTypeParameter;
import com.qa.EmployeePage;
import org.testng.annotations.Test;

public class CreateEmployee extends BaseTest {
EmployeePage employeePage;

@Test 
public void CreateEmployee1(){
EmployeePage employeePage = new EmployeePage(driver, wait);
employeePage.createEmployee("John", "Developer");
employeePage.getEmployeeListSize();
System.out.println("**********CreateEmployee1 running");
System.out.println("**********DeleteEmployee running");


    }

    public void DeleteEmployee()
    {
        System.out.println("############CreateEmployee1 running");
        System.out.println("############DeleteEmployee running");
    //EmployeePage employeePage = new EmployeePage(driver, wait);

    //employeePage.createEmployee("John", "Developer");
    employeePage.searchEmployee("John");
    employeePage.deleteEmployee();

    }
}