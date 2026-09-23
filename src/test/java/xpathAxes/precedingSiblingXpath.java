package xpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class precedingSiblingXpath {
    public static void main(String[] args){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://www.nseindia.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        try {
            WebElement footer = driver.findElement(By.xpath("//ul[@class='quick_list me-2']/preceding-sibling::div"));
            System.out.println(footer.getAttribute("class"));
        }
        catch(Exception e){
            System.out.println("Error" + e);
        }
        finally{
            driver.close();
        }
    }
}
