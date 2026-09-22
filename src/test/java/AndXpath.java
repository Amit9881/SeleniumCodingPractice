import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AndXpath {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nseindia.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement subMenu =driver.findElement(By.xpath("//a[@role='button' and @id='link_4']"));
        String value = subMenu.getAttribute("class");
        System.out.println(value);
        driver.close();
    }
}
