package SeleniumTerms.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class rightandDoubleCLick {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testautomationstudio.com/demo/actions/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Actions act = new Actions(driver);
        WebElement rightClick = driver.findElement(
                By.xpath("//input[@id='action1']"));

        act.moveToElement(rightClick).click().build().perform();

        WebElement DoubleClick = driver.findElement(
                By.xpath("//input[@id='action1A']")
        );

        act.moveToElement(DoubleClick).doubleClick().build().perform();

        driver.close();

    }
}
