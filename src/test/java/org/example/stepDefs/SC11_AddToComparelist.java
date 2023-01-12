package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class SC11_AddToComparelist {

    P03_HomePage add = new P03_HomePage();

@When("User add HTC device to compare List")
public void addToCompare (){

    add.HTCCompare().click();
}


    @Then("Success Message in green appears")
    public void successMessageInGreenAppears() {
        SoftAssert soft = new SoftAssert();
        String actualMssg = add.SuccessCompare().getText();
        soft.assertEquals(actualMssg, "The product has been added to your product comparison");


        String actualColor = add.SuccessCompare().getCssValue("background-color");
        actualColor = Color.fromString(actualColor).asHex();
        soft.assertEquals(actualColor, "#4bb07a");

        soft.assertAll();



    }
}
