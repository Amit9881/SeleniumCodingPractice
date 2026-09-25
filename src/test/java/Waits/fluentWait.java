package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class fluentWait {
    public static void main(String[] args){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(option);
        try{
        driver.get("https://www.nseindia.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

            WebElement val = wait.until(
                    driver1 -> driver.findElement
                            (By.xpath("//div[starts-with(@id,'marketStat')]")
                            )
            );
            System.out.println("Element found " + val.getText());

        }catch(Exception e){
            System.out.println("Error " + e);
        }
        finally{
            driver.close();
        }
    }
}
