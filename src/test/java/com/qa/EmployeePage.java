package com.qa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class EmployeePage{

protected WebDriver driver;
protected WebDriverWait wait;
EmployeePage(WebDriver driver, WebDriverWait wait){
    this.driver = driver;
    this.wait = wait;
}

// Locatores
By name = By.id("empName");
By role = By.id("empRole");
By createBtn = By.id("createBtn");
By DeleteBtn = By.className("deleteBtn");
By SearchInput = By.id("searchInput");

// Actions
public void createEmployee(String empName, String empRole){
    wait.until(ExpectedConditions.visibilityOfElementLocated(name)).sendKeys("empName");
    wait.until(ExpectedConditions.visibilityOfElementLocated(role)).sendKeys(empRole);
    wait.until(ExpectedConditions.elementToBeClickable(createBtn)).click();

}

public void searchEmployee(String empName){
    wait.until(ExpectedConditions.visibilityOfElementLocated(SearchInput)).sendKeys(empName);

}


public void deleteEmployee(){

   wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtn)).click();
}
public int getEmployeeListSize(){
  return driver.findElements(By.cssSelector("#empTable tbody tr")).size();
    
}
}



