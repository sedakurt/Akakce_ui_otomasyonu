package TestCases;

import dataProvider.ConfigFileReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommentLikeTest {

        ConfigFileReader configFileReader = new ConfigFileReader();
    public static WebDriver driver;
     @Given("I'm going to the {string} website")
    public void iMGoingToTheWebsite(String arg0) {
         System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
         driver.get(String.valueOf(Hook.driver));
        }

    @And("I search a product to see details")
    public void iSearchAProductToSeeDetails() {
        driver.findElement(By.id("SearchBoxOld")).sendKeys("kulaklık");
        driver.findElement(By.id("SearchBoxOld-buttonContainer")).click();
        driver.close();
    }

    @When("There is any comment do nothing")
    public void thereIsAnyCommentDoNothing() {

    }

    @And("I choose a product and go to the product detail page")
    public void iChooseAProductAndGoToTheProductDetailPage() {

    }

    @And("I click {string} button")
    public void iClickButton(String arg0) {
    }

    @And("I choose the first comment and click {string} button")
    public void iChooseTheFirstCommentAndClickButton(String arg0) {
    }

    @Then("I see the “Teşekkür Ederiz” message")
    public void iSeeTheTeşekkürEderizMessage() {
    }

    @When("I don't see any comment")
    public void iDonTSeeAnyComment() throws InterruptedException {
        Thread.sleep(50);
    }
    @Then("I quit the product detail page")
    public void iQuitTheProductDetailPage() {

    }
}

