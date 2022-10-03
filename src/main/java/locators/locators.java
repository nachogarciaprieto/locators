package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class locators {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();

        //Initialize the webdriver
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();

        //Open the website
        driver.get("https://www.saucedemo.com");

        //Maximize the webbrowser
        driver.manage().window().maximize();

        //Keep opened 10 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Credentials
        String username = "standard_user";
        String password = "secret_sauce";

        //Locator by ID
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        //Login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

        //Close the webbrowser
        //driver.quit();

    }

}
