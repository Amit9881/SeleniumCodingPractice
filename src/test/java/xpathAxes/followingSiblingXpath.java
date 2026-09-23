package xpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class followingSiblingXpath {
    public static void main(String[] args){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--start-maximized");
        option.addArguments("--incognito");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nseindia.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        try {
            List<WebElement> menu = driver.findElements(By.xpath("//li[@class=\"nav-item dropdown \"]/following-sibling::li"));
            for (WebElement subMenu : menu) {
                System.out.println(subMenu.getText());
            }
        }
        catch(Exception e){
            System.out.println("Error " + e );
        }
        finally{
            driver.close();
        }
    }
}
