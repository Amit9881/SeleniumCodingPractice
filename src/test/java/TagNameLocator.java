import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TagNameLocator {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nseindia.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        List<WebElement>  menu = driver.findElements(By.tagName("li"));
//        for(WebElement m : menu){
//            System.out.println(m.getAttribute("class"));
//        }

        for(int i = 0; i< menu.size();i++){
            System.out.println(menu.get(i).getAttribute("class"));
        }
        driver.close();



    }
}
