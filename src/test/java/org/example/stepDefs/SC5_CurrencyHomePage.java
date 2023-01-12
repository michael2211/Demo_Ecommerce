package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SC5_CurrencyHomePage {

P03_HomePage homePage = new P03_HomePage();
@Then("First option is USD")
    public void firstOptionIsUSD (){
    Select currencyList = new Select(homePage.currencyList());
    String FirstOption = currencyList.getFirstSelectedOption().getText();

    //Assertion
    Assert.assertEquals(FirstOption, "US Dollar");

    }

@When("user select Euro")
    public void UserSelectEuro (){
    Select currencyList = new Select(homePage.currencyList());
    currencyList.selectByVisibleText("Euro");

    }


    @Then("The prices change successfully")
    public void thePricesChangeSuccessfully() {
        for (int x=0 ; x<4; x++)

        {
String price = homePage.prices().get(x).getText();
            System.out.println(x);
            System.out.println(price);
            Assert.assertTrue(price.contains("€"));

        }

    }
}
