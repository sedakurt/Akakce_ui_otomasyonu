package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import dataProvider.ConfigFileReader;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;


public class Hook {
   //public static WebDriver driver;
   public String baseURL = ConfigFileReader.getApplicationUrl();

   public static WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void setUp() {

        try {
            ConfigFileReader configFileReader = new ConfigFileReader();
            System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);

            //dynamic wait
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            setWebDriver(new ChromeDriver(new ChromeOptions()));
            getWebDriver().navigate().to(baseURL);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getWebDriver(){
        return driver;
     }

    public static void setWebDriver(WebDriver webDriver){
        CommentLikeTest.driver=webDriver;
    }

    @AfterTest
    public void driverQuit() throws Exception {
        driver.quit();
    }
}