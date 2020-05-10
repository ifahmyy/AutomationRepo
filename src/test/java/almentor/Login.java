package almentor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login {
    ChromeDriver driver;

    @BeforeTest
    public void openURL() {


        String chromePath = System.getProperty("user.dir") + "//resources//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://almentor.net");
        driver.manage().window().maximize();



    }

    @Test

    public void login()
    {

        WebElement login = driver.findElementById("global_login_button");
        login.click();
        WebElement email = driver.findElementById("email");
        WebElement password = driver.findElementById("password");
        WebElement loginBTN = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[4]/form/div[4]/div[2]/button");

        email.sendKeys("esraa.emad@almentor.net");
        password.sendKeys("esraa123");
        loginBTN.click();



        String actualUrl="https://almentor.net/en/home";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }

}


