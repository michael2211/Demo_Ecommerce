package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.ui.Select;

public class SC12_CreateOrder {

    P03_HomePage add = new P03_HomePage();
    P02_Login login= new P02_Login();

    @Given("user add mobile to card")
    public void stepOne(){

        login.loginLink().click();
        login.emailID().sendKeys("test1199@example.com");
        login.Password().sendKeys("password");
        login.LoginButton().click();


        add.ADDHTCTOCART().click();

    }

    @When("user goto Cart")
    public void userGotoCart() {

        add.shoppingCart().click();
        add.terms().click();
        add.checkOutButton().click();

    }


    @And("enter address details")
    public void enterAddressDetails() {

        Select country = new Select(add.country());
        country.selectByVisibleText("United States");

        add.city().sendKeys("New Yourk");

        add.address().sendKeys("123456");
        add.postalCode().sendKeys("12343");
        add.phone().sendKeys("+122223344555");

        add.continueButton().click();

        add.shipping().click();
        add.continueButton2().click();
        add.payment().click();

        add.continueButton3().click();
        add.continueButton4().click();
        add.confirmButton().click();




    }

    @Then("order will be done")
    public void orderWillBeDone() {


    }
}
