package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SC7_FilterWithColor {

    P03_HomePage filter = new P03_HomePage();

    @When("User goto apparel and select Shoes")
    public void gotoApparel (){
        filter.apparel().click();
        filter.shoes().click();


    }



   @Then("user can filter by color")
  public void userCanFilterByColor() {

      filter.redShoes().click();
  }
}
