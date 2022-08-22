package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginUsingSelenium {
    @Test public void Login() { // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "path of driver");
        WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");

        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
        username.sendKeys("example@gmail.com"); password.sendKeys("password");
        login.click(); String actualUrl="https://www.linkedin.com/feed/";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl); }
    @Test public void SignupOptionforNewUsers(){
        System.setProperty("webdriver.chrome.driver", "path of driver");
        WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");
        WebElement login=driver.findElement(By.xpath("//button[text()='Sign up']"));
        login.click();
    }
    @Test public void ResetPassword(){
        System.setProperty("webdriver.chrome.driver", "path of driver");
        WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");
        WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
        login.click();
        login = driver.findElement(By.xpath("//button[text()='Reset password']"));
        login.click();

    }
    @Test public void CheckKeepingPassword(){
        System.setProperty("webdriver.chrome.driver", "path of driver");
        WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");

        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
        username.sendKeys("example@gmail.com"); password.sendKeys(" ");
        login.click(); String actualUrl="https://www.linkedin.com/feed/";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Test public void CodeValidation(){
        System.setProperty("webdriver.chrome.driver", "path of driver");
        WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");

        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
        login = driver.findElement(By.xpath("//button[text()='Reset password']"));
        username.sendKeys("example@gmail.com");
        WebElement login=driver.findElement(By.xpath("//button[text()='Input verification pin]"));
        login.click();


    }


    }