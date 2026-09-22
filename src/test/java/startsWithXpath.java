import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class startsWithXpath {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nseindia.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement index = driver.findElement(By.xpath("//div[starts-with(@class,'index')]"));
       String tab= index.getAttribute("tabindex");
       System.out.println(tab);
       driver.close();
    }
}
