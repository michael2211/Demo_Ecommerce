package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P03_HomePage {

    public WebElement currencyList (){

        return Hooks.driver.findElement(By.id("customerCurrency"));

    }


    public List<WebElement> prices() {
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));

    }

    public WebElement Search(){
        return Hooks.driver.findElement(By.name("q"));

    }

    public WebElement SearchButton(){
        return Hooks.driver.findElement(By.className("search-box-button"));

    }

    public List<WebElement> Products() {
        return Hooks.driver.findElements(By.className("product-item"));

    }

    public WebElement Device () {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]"));

    }


    public WebElement MACSKU (){
        return Hooks.driver.findElement(By.id("sku-4"));

    }

    public WebElement HoverComputer (){

        return driver.findElement(By.cssSelector("a[href=\"/computers\"]"));

    }
    public List<WebElement> subCategories()
    {
    return Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]+div[class=\"sublist-toggle\"]+ul[class=\"sublist first-level\"]>li"));
    }

    public WebElement pageTitle()
    {
        return driver.findElement(By.cssSelector("div[class=\"page-title\"]>h1"));
    }

    public List<WebElement> SelectDesktops ()
    {
        return Hooks.driver.findElements(By.cssSelector("a[href=\"/desktops\"]"));

    }


    public WebElement facebook(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));

    }

public WebElement twitter(){

        return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
}

public WebElement rss(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));


}

public WebElement youtube(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));

}

public WebElement HTC (){

        return Hooks.driver.findElements(By.className("add-to-wishlist-button")).get(2);
}

public WebElement HTCCompare (){
        return Hooks.driver.findElements(By.className("add-to-compare-list-button")).get(2);
}
public WebElement SuccessCompare (){

    return Hooks.driver.findElement(By.className("success"));
}


public WebElement HTCWishList (){
    return Hooks.driver.findElement(By.className("success"));
}

public WebElement WishListOption (){
     return Hooks.driver.findElement(By.className("ico-wishlist"));

}

public WebElement ADDHTCTOCART(){
    return Hooks.driver.findElements(By.className("product-box-add-to-cart-button")).get(2);

}

    public WebElement successCart(){
        return Hooks.driver.findElement(By.className("success"));

    }


public WebElement QTY ()
{
    return Hooks.driver.findElement(By.cssSelector("input[value=\"1\"]"));

}


public WebElement NokiaMobile ()
{
   return Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child(1)"));

}

    public WebElement iPhone ()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child(2)"));

}

   public WebElement apparel () {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));

    }

    public WebElement shoes(){
        return driver.findElement(By.cssSelector("li[class=\"active last\"] a[href=\"/shoes\"]"));

    }

    public WebElement redShoes (){
        return Hooks.driver.findElement(By.id("attribute-option-15"));

    }

    public WebElement awesome (){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/awesome\"]"));

    }


    public WebElement shoppingCart (){
        return Hooks.driver.findElement(By.className("cart-label"));

    }

    public WebElement terms (){
        return Hooks.driver.findElement(By.id("termsofservice"));

    }

    public WebElement checkOutButton (){
        return Hooks.driver.findElement(By.className("checkout-button"));

    }



    public WebElement country(){
        return Hooks.driver.findElement(By.cssSelector("select[id=\"BillingNewAddress_CountryId\"]"));


    }

    public WebElement city(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_City\"]"));

    }


    public WebElement address(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_Address1\"]"));

    }

    public WebElement postalCode(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_ZipPostalCode\"]"));

    }


    public WebElement phone(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_PhoneNumber\"]"));

    }

    public WebElement continueButton(){
        return Hooks.driver.findElement(By.className("new-address-next-step-button"));

    }


    public WebElement shipping(){
        return Hooks.driver.findElements(By.className("method-name")).get(0);

    }


    public WebElement continueButton2(){
        return Hooks.driver.findElement(By.className("shipping-method-next-step-button"));

    }



    public WebElement payment(){
        return Hooks.driver.findElements(By.className("method-name")).get(0);

    }

    public WebElement continueButton3(){
        return Hooks.driver.findElement(By.className("payment-method-next-step-button"));

    }

    public WebElement continueButton4(){
        return Hooks.driver.findElement(By.className("payment-info-next-step-button"));

    }


    public WebElement confirmButton(){
        return Hooks.driver.findElement(By.className("confirm-order-next-step-button"));

    }


    public WebElement confirmOrder (){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-body checkout-data\"]"));

    }



}



