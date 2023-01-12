package org.example.stepDefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.testng.asserts.SoftAssert;

public class SC3_ResetPassword {

P02_Login reset = new P02_Login();

@Given("User needs to login")
public void firstStep (){

    reset.loginLink().click();




}


    @When("User forgot the password")
    public void userForgotThePassword() {

    reset.ForgotPassword().click();
    reset.RecoverPassword().sendKeys("test1986@example.com");
    reset.RecoverButton().click();



    }

    @Then("He can reset the password by sending email")
    public void heCanResetThePasswordBySendingEmail() {

        SoftAssert soft = new SoftAssert();
        String SuccessMessage = reset.SucMessage().getText();

        soft.assertEquals(SuccessMessage,"Email with instructions has been sent to you.");


        soft.assertAll();


    }
}
