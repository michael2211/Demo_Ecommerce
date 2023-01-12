package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P02_Login {

    public WebElement loginLink() {
        return driver.findElement(By.className("ico-login"));

    }

    public WebElement emailID() {
        return driver.findElement(By.className("email"));

    }

    public WebElement Password() {
        return driver.findElement(By.name("Password"));

    }

    public WebElement LoginButton() {
        return driver.findElement(By.className("login-button"));
    }

    public WebElement MyAccount() {
        return driver.findElement(By.className("ico-account"));

    }

    public WebElement FailureMssg () {
        return driver.findElement(By.className("validation-summary-errors"));

    }

    public WebElement ForgotPassword (){

        return driver.findElement(By.className("forgot-password"));

    }


    public WebElement RecoverPassword (){

        return driver.findElement(By.id("Email"));

    }


   public WebElement RecoverButton (){

       return driver.findElement(By.name("send-email"));

    }


    public WebElement SucMessage (){
        return driver.findElement(By.className("content"));

    }

}