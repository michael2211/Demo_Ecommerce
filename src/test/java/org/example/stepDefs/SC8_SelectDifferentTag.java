package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;

public class SC8_SelectDifferentTag {

    P03_HomePage select = new P03_HomePage();

    @When("User Open Apparel")
public void selectApparel (){
    select.apparel().click();

}


    @Then("User can select different tags")
    public void userCanSelectDifferntTags() {

        select.awesome().click();

    }
}
