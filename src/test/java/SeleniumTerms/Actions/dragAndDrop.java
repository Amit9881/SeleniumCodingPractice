package SeleniumTerms.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class dragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testautomationstudio.com/demo/actions/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement src = driver.findElement(
                By.xpath("//ul[@id='sortable1']/li")
        );
        WebElement dest = driver.findElement(
                By.xpath("//ul[@id='sortable2']/li")
        );

        Actions act = new Actions(driver);
        act.dragAndDrop(src,dest).build().perform();
        Thread.sleep(500);
        driver.close();
    }
}
