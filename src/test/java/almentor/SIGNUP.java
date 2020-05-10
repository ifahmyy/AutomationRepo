package almentor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SIGNUP {
    ChromeDriver driver;

    @BeforeTest
    public void openURL() {


        String chromePath = System.getProperty("user.dir") + "//resources//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://almentor.net");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void signUp()
    {
        WebElement signUp = driver.findElementById("global_signup_button");
        signUp.click();

        WebElement name = driver.findElementById("name");
        WebElement email = driver.findElementById("email");
        WebElement password = driver.findElementById("password");
        WebElement confirmPassword = driver.findElementById("confirmPassword");
        WebElement createAccount = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div[5]/form/div[6]/div[2]/button");
        name.sendKeys("hamada");
        email.sendKeys("mahmoudalmentor+301@gmail.com");
        password.sendKeys("123456");
        confirmPassword.sendKeys("123456");
        createAccount.click();



    }

}
