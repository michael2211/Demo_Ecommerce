package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;


public class SC4_Search {
    P03_HomePage homePage = new P03_HomePage();

    @When("User click on search option")
    public void SearchOption() {
        homePage.Search().sendKeys("mac");
    }

    @And("When User Search with book")
    public void whenUserSearchWithBook() {

        homePage.SearchButton().click();
    }


    @Then("User could find mac relative Results")
    public void userCouldFindBookRelativeResults() {
        //Assertion
        SoftAssert soft = new SoftAssert();

        //Get Actual URL
        String actualURL = driver.getCurrentUrl();
        soft.assertTrue(actualURL.contains("https://demo.nopcommerce.com/search?q=mac"));


       // for (int x = 0; x < 1; x++) {
        //    String product = homePage.Products().get(x).getText();
           // System.out.println(x);
        //    System.out.println(product);
            //soft.assertTrue(product.toLowerCase().contains("mac"));

            soft.assertAll();

        }


    }


   // @When("User go to Search Option")
    //public void userGoToSearchOption() {
       // homePage.Search().sendKeys("AP_MBP_13");

   // }

    //@And("When search with a product by SKU")
   // public void whenSearchWithAProductBySKU() {


       // homePage.SearchButton().click();
       // homePage.Device().click();

  //  }

    //@Then("User could find the Device SKU")
   // public void userCouldFindTheDeviceSKU() {

        //Assertion

//boolean SKU = homePage.MACSKU().isDisplayed();
//Assert.assertTrue(SKU);


   // }


