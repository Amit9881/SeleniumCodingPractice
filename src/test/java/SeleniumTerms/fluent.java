package SeleniumTerms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class fluent {
    public static void main(String[] args){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(option);
        try{
            driver.get("https://testautomationcentral.com/demo/dynamic_loading.html");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(10))
                    .pollingEvery(Duration.ofSeconds(2))
                    .ignoring(NoSuchElementException.class);
//            WebElement dynamicButton = wait.until(WebDriver -> {
//                        return WebDriver.findElement(By.xpath("//a[text()='Dynamic Loading']")
//                        );
//                    }
//            );
//            dynamicButton.click();
            WebElement startLoading = wait.until(WebDriver ->
                    WebDriver.findElement(By.xpath("//button[@onclick='startLoading()']")
                    )
            );
            startLoading.click();



            WebElement loadingText = wait.until(WebDriver->
                    WebDriver.findElement(By.xpath("//div[@id='loading-content']")
                    )
            );
            System.out.println(loadingText.getText());
        }catch(Exception e){
            System.out.println(" Error " + e);
        }
        finally{
            driver.close();
        }
    }
}
