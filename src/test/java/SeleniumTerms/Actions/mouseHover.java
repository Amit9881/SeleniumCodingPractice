package SeleniumTerms.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class mouseHover {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationcentral.com/demo/tool_tips.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement hover = driver.findElement(By.xpath(
                "//button[@id='tool-tip-button']"
        ));
        Actions act = new Actions(driver);
        act.moveToElement(hover).click().build().perform();
        Thread.sleep(500);
        driver.close();
    }
}
