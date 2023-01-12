package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class SC9_AddToCart {

    P03_HomePage add = new P03_HomePage();

    @When("User add HTC to Cart")
    public void addHTCtoCart(){

        add.ADDHTCTOCART().click();

    }


    @Then("Success Message in green appears that product added to cart")
    public void successMessageInGreenAppearsThatProductAddedToCart() {

        SoftAssert soft = new SoftAssert();
        String actualMssg = add.successCart().getText();
        soft.assertEquals(actualMssg, "The product has been added to your shopping cart");


        String actualColor = add.successCart().getCssValue("background-color");
        actualColor = Color.fromString(actualColor).asHex();
        soft.assertEquals(actualColor, "#4bb07a");

        soft.assertAll();


    }
}
