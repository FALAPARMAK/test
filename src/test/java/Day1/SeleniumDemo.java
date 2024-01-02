package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class SeleniumDemo {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","/Users/mehmetalaparmak/Downloads/geckodriver");
       // System.setProperty("webdriver.chrome.driver","/Users/mehmetalaparmak/Downloads/chromedriver_mac64 2/chromedriver");



        WebDriver driver=new FirefoxDriver();
        //WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://facebook.com");
        driver.findElement(By.name("email")).sendKeys("4694233332");
        driver.findElement(By.id("pass")).sendKeys("Password123");
         WebElement login=  driver.findElement(By.name("login"));
         login.click();
       // driver.get("http://google.com");

//
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,4000)");
//
//        driver.findElement(By.cssSelector("#fname"));
//
//        driver.findElement(By.id("login"));
        driver.quit();




    }
}
