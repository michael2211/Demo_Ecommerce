package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class SC10_Wishlist {
P03_HomePage homePage = new P03_HomePage();

    @Given("user Add HTC to Wishlist")
    public void adddToWishList (){

        homePage.HTC().click();

    }

    @Then("Success Message in green will appear")
    public void successMessageInGreenWillAppear() {
        SoftAssert soft = new SoftAssert();

        String actualMssg = homePage.HTCWishList().getText();
        soft.assertEquals(actualMssg, "The product has been added to your wishlist");

        String actualColor = homePage.HTCWishList().getCssValue("background-color");
        actualColor = Color.fromString(actualColor).asHex();
        soft.assertEquals(actualColor, "#4bb07a");

        soft.assertAll();

    }

    @Given("user Add HTC toWishlist")
    public void userAddHTCToWishlist() {

        homePage.HTC().click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.className("success"))));


    }


    @When("User GoTo WishList")
    public void userGoToWishList() {


        homePage.WishListOption().click();


    }


    @Then("HTC one QTY added")
    public void htcOneQTYAdded() {

        String qty = homePage.QTY().getAttribute("value");
        System.out.println(qty);

        Assert.assertTrue(qty.contains("1"));


    }
}
