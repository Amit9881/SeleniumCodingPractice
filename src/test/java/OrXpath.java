import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrXpath {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nseindia.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement col = driver.findElement(By.xpath("//th[@scope='col' or @class='text-end']"));
        String val = col.getText();
        System.out.println(val);
        driver.close();
    }
}
