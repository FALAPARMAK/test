package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationPractice {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/mehmetalaparmak/Downloads/geckodriver");
        WebDriver driver=new FirefoxDriver();

        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        WebElement search= driver.findElement(By.id("gh-ac"));
        search.sendKeys("phone case");
        driver.findElement(By.id("gh-btn")).click();

       // driver.findElement(By.xpath("/html/body/div[5]/div[4]/div[2]/div[1]/div[2]/ul/li[1]/div/div/div/div/div/ul/li[1]/div/a/div")).click();


        Thread.sleep(5000);
        driver.quit();


    }






}
