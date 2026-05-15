package com.qa;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.utils.ExtentReportListener;

@Listeners(ExtentReportListener.class)
public class CreateEmployee extends BaseTest {

    EmployeePage employeePage;

    @Test
    public void CreateEmployee1() {

        employeePage = new EmployeePage(driver, wait);

        employeePage.createEmployee("John", "Developer");

        employeePage.getEmployeeListSize();

        System.out.println("********** CreateEmployee1 running");
    }

    @Test
    public void DeleteEmployee() {

        employeePage = new EmployeePage(driver, wait);

        System.out.println("############ DeleteEmployee running");

        employeePage.searchEmployee("John");
        employeePage.deleteEmployee();
    }
}