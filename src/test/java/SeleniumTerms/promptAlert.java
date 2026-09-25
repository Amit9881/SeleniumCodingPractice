package SeleniumTerms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class promptAlert {
    public static  void main(String[] args){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(option);
        try{
            driver.get("https://testautomationcentral.com/demo/alerts.html");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
            WebElement promptButton = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath
                            ("//button[@data-target='prompt-tab']"))
                                );
            promptButton.click();

            WebElement showPromptButton = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath
                            ("//button[@onclick='showPrompt()']"))
            );
            showPromptButton.click();

            Alert alt = driver.switchTo().alert();
            alt.sendKeys("swipe");
            alt.accept();

            System.out.println("Alert is accepted");

        }
        catch(Exception e){
            System.out.println(" Error " + e);
        }
        finally{
            driver.close();
        }
    }
}
