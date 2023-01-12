package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;


public class SC1_Register {

    P01_Register register = new P01_Register();
    @Given("user go to register page")
    public void Step1 (){
        register.regLink().click();

    }


    @When("user select gender type")
    public void userSelectGenderType() {
        register.gendertype().click();
        
    }


    @And("user first and last name")
    public void userFirstAndLastName() {
        register.firstName().sendKeys("michael");
        register.lastName().sendKeys("youssef");

        
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        //Select Day
        Select day = new Select(register.DayList());
        day.selectByValue("1");

        //Select Month
        Select month = new Select(register.MonthList());
        month.selectByValue("1");

        //Select Year
        Select year = new Select(register.YearList());
        year.selectByValue("1980");

    }

    @And("user enter valid email")
    public void userEnterValidEmail() {
        register.EmailID().sendKeys("test1986@example.com");

    }

    @And("user enter company")
    public void userEnterCompany() {
        register.CompanyName().sendKeys("Google");

    }

    @And("user enter password and confirm password")
    public void userEnterPasswordAndConfirmPassword() {
        register.Password().sendKeys("password");
        register.ConfirmPassword().sendKeys("password");

    }

    @And("user click register")
    public void userClickRegister() {
        register.RegisterButton().click();

    }

    @Then("User login Successfully")
    public void userLoginSuccessfully() {

        //Assertion

        SoftAssert soft = new SoftAssert();

        //get Actual URL
        String actualURL = driver.getCurrentUrl();
        soft.assertEquals(actualURL, "https://demo.nopcommerce.com/registerresult/1?returnUrl=/");

        //Message
        String actualMessage = register.SucMessage().getText();
        soft.assertEquals(actualMessage, "Your registration completed");

        //Message Color
        String actualColor = register.SucMessage().getCssValue("color");
        actualColor = Color.fromString(actualColor).asHex();
        soft.assertEquals(actualColor, "#4cb17c");



        //Continue Button
        boolean statusButton = register.ContinueButton().isDisplayed();
        soft.assertTrue(statusButton);

        soft.assertAll();





    }

}
