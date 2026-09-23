package xpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class childXpath {
    public static void main(String[] args){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.nseindia.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='navbar-nav me-auto']/child::li"));
        for(WebElement l : list){
            System.out.println(l.getText());
        }
        driver.close();
    }
}
