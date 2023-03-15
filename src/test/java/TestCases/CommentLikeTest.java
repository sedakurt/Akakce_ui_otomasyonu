package TestCases;

import dataProvider.ConfigFileReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class CommentLikeTest {
    ConfigFileReader configFileReader = new ConfigFileReader();
    public WebDriver driver;
    String baseURL = configFileReader.getApplicationUrl();
    String driverPath= configFileReader.getDriverPath();

    String targetURL=  configFileReader.getDriverTargetPath();

     @Given("I'm going to the {string} website")
    public void iMGoingToTheWebsite(String arg0) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", driverPath);
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
         driver.get(baseURL);
        }

    @And("I search a product to see details")
    public void iSearchAProductToSeeDetails() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"q\"]")));
        element.sendKeys("kulaklık");
        element.sendKeys(Keys.ENTER);//Post the text
     }
    @When("There is any product do nothing")
    public void thereIsAnyProductDoNothing() throws InterruptedException {

        if (driver.findElements(By.xpath("/html/body/p")).size() == 0) {
            driver.quit();
        }
        else{
            Thread.sleep(200);
        }
    }
    @And("I choose a product and go to the product detail page")
    public void iChooseAProductAndGoToTheProductDetailPage() throws InterruptedException {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"PL_38_1095\"]/li[3]/a/img")).click();
     }
    @And("I click {string} button")
    public void iClickButton(String arg0) throws InterruptedException {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);
        WebElement commentElement = driver.findElement(By.cssSelector("#pf_w_v8 > span"));
        commentElement.click();
    }
    @Then("I see the login page")
    public void iSeeTheLoginPage() {
     String currentUrl = driver.getCurrentUrl();
            //Assert that text box is empty
        Assertions.assertEquals(targetURL, currentUrl);
         }
    @Then("I quit the product detail page")
    public void iQuitTheProductDetailPage() {
         driver.quit();

    }
}

