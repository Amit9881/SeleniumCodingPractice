package SeleniumTerms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class tabHandles {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaplayground.com/practice/tabs-windows");
        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[@aria-label='Open Tab A']")).click();
        System.out.println(driver.getTitle());
        System.out.println("Get parent title");
        Set<String> childTab = driver.getWindowHandles();
//        driver.switchTo().newWindow(WindowType.TAB);
//        System.out.println(driver.getTitle());
//        System.out.println("Get child tab title");
//        driver.switchTo().defaultContent();
        //driver.findElement(By.xpath("//button[@aria-label='Open Tab B']"));

        for(String tab : childTab){
            if(!tab.equals(parentWindow)){
                driver.switchTo().window(tab);

            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(parentWindow);

    }
}
