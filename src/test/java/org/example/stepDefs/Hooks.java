package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {

public static WebDriver driver= null;

    @Before
    public void openBrowser () {
        //Define Bridge
        WebDriverManager.chromedriver().setup();
        // new object from chrome
        driver = new ChromeDriver();

        //configuration
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://demo.nopcommerce.com/");


    }


    @After
    public void quitDriver () throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();


    }

}
