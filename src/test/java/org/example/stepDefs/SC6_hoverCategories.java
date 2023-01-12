package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.example.pages.P03_HomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static org.example.stepDefs.Hooks.driver;

public class SC6_hoverCategories {

    String subCateName;
    String pageTitle;
    Actions action = new Actions(driver);
    P03_HomePage hover = new P03_HomePage();

@Given("User Hover Computer")
  public void HoverComputer (){

  action.moveToElement(hover.HoverComputer()).perform();

}


    @When("user select random category")
    public void userSelectRandomCategory() {
        int min=0;
        int count= hover.subCategories().size();
        int max= count -1;

        int selectedsub = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(selectedsub);
        subCateName =     hover.subCategories().get(selectedsub).getText();

        hover.subCategories().get(selectedsub).click();

    }

    @Then("User open selected subcategory successfully")
    public void userCheckDesktops() {
        pageTitle = hover.pageTitle().getText();


        Assert.assertEquals(subCateName.toLowerCase(),pageTitle.toLowerCase());

    }

}
