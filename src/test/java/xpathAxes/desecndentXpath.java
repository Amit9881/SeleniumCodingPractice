package xpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class desecndentXpath {
    public static void main(String[] args){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.nseindia.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        try {
            WebElement menu = driver.findElement(By.xpath("//div[@class='index_val']/descendant::div[@class='streaming']"));
            System.out.println(menu.getText());
        }
        catch(Exception e){
            System.out.println("error " + e);
        }
        finally{
            driver.close();
        }
    }
}
