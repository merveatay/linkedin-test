package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects extends BasePageObjects{
    public LoginPageObjects(WebDriver driver){
        this.driver= (WebDriver) driver;
    }
    By username_text_box= By.id ("username");
    By password_text_box= By.id ("password");
    By login_button= By.id ("login");

    public void setTextIntoLoginTextBox(String text){
        String email = "example@gmail.com";
        String password = "password";


    }
}
