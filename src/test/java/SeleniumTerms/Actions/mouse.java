package SeleniumTerms.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class mouse {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationcentral.com/demo/color_picker.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement colourPicker = driver.findElement(
                By.xpath("//input[@id='color-picker']")
        );
        Actions act = new Actions(driver);
        act.moveToElement(colourPicker).moveByOffset(40,0).build().perform();
        Thread.sleep(500);
        driver.close();

    }
}
