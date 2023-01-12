package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P01_Register {

    public WebElement regLink (){

        return driver.findElement(By.className("ico-register"));

    }

    public WebElement gendertype () {

        return driver.findElement(By.id("gender-male"));
    }

    public WebElement firstName () {
        return driver.findElement(By.name("FirstName"));
    }

    public WebElement lastName () {
        return driver.findElement(By.name("LastName"));
    }

    public WebElement DayList (){

        return driver.findElement(By.name("DateOfBirthDay"));
    }


    public WebElement MonthList (){
        return driver.findElement(By.name("DateOfBirthMonth"));

    }

    public WebElement YearList (){
        return driver.findElement(By.name("DateOfBirthYear"));

    }

public WebElement EmailID () {
        return driver.findElement(By.name("Email"));

}

public WebElement CompanyName () {
        return driver.findElement(By.name("Company"));

}

public WebElement Password () {
        return driver.findElement(By.name("Password"));
}

public WebElement ConfirmPassword () {
return driver.findElement(By.name("ConfirmPassword"));

}

public WebElement RegisterButton () {
        return driver.findElement(By.name("register-button"));
}

public WebElement SucMessage () {
    return driver.findElement(By.className("result"));

}
public WebElement ContinueButton () {
        return driver.findElement(By.className("register-continue-button"));

}



}
