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

public class fluentWait1 {
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

            WebElement val = wait.until(Ddriver ->
                    driver.findElement(By.xpath("//div[@class='usdInr']"))
                    );
            System.out.println("element found" + val.getAttribute("class"));
        }catch(Exception e){
            System.out.println("Error " + e);
        }
        finally{
            driver.close();
        }
    }
}
