package CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class css {
    public static void main(String[] args){
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.nseindia.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
         //class
        WebElement cssClass = driver.findElement(By.cssSelector(".nav-item"));
        System.out.println(cssClass.getText());
        //id
        WebElement cssId = driver.findElement(By.cssSelector("#link_2"));
        System.out.println(cssId.getText());
        //Attribute
        WebElement att = driver.findElement(By.cssSelector("a[id='link_3']"));
        System.out.println(att.getText());
//        WebElement mul = driver.findElement(By.cssSelector("a[role='button'][id='link_4]"));
//        System.out.println(mul.getText());
        WebElement sWith = driver.findElement(By.cssSelector("th[class^='text']"));
        System.out.println(sWith.getText());
        WebElement eWith = driver.findElement(By.cssSelector("th[class$='_value']"));
        System.out.println(eWith.getText());
        driver.close();
    }
}
