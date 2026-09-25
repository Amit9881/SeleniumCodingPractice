package SeleniumTerms.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class scrollDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nseindia.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        WebElement scroll = driver.findElement(
                By.xpath("//div[@class='link_icon']")
        );
        js.executeScript("arguments[0].scrollIntoView(true)",scroll);
        Thread.sleep(1000);
        driver.close();
    }
}
