package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://www.nseindia.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));

        try{
            WebElement val = driver.findElement(By.xpath("//img[@alt='nifty-usd-logo']"));
            wait.until(ExpectedConditions.visibilityOf(val));
        }catch(Exception e){
            System.out.println("Error " + e);
        }
        finally{
            driver.close();
        }
    }

}
