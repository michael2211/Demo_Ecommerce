package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class SC2_Login {

    P02_Login login = new P02_Login();
    @Given("user go to login page")
    public void Step1 (){
        login.loginLink().click();

    }

    @When("user login with valid users")
    public void userLoginWithValidUsers() {
        login.emailID().sendKeys("test1986@example.com");
        login.Password().sendKeys("password");

    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.LoginButton().click();

    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        //Assertion
        SoftAssert soft = new SoftAssert();

        //Get Actual URL
        String actualURL = driver.getCurrentUrl();
        soft.assertEquals(actualURL, "https://demo.nopcommerce.com/");

        //My Account will appear
        boolean MyAccount = login.MyAccount().isDisplayed();
        soft.assertTrue(MyAccount);

        soft.assertAll();


    }



    @Given("user go to login page again")
    public void userGoToLoginPageAgain() {
        login.loginLink().click();

    }

    @When("user login with invalid users")
    public void userLoginWithInvalidUsers() {
        login.emailID().sendKeys("test22@example.com");
        login.Password().sendKeys("password");


    }

    @And("user press on login button again")
    public void userPressOnLoginButtonAgain() {
        login.LoginButton().click();


    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        //Assertion
        SoftAssert soft = new SoftAssert();


        //Failed Login Message
        String failedMessage = login.FailureMssg().getText();
        soft.assertEquals(failedMessage, "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");

        //Actual Color
        String actualColor = login.FailureMssg().getCssValue("color");
        actualColor = Color.fromString(actualColor).asHex();
        soft.assertEquals(actualColor, "#e4434b");


        soft.assertAll();

    }
}
