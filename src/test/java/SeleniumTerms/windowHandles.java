package SeleniumTerms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class windowHandles {
    public static void main(String[] args){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(option);

        try{
            driver.get("https://qaplayground.com/practice/tabs-windows");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            WebElement window = null;
            try{
               window = driver.findElement(By.xpath("//button[@id='tw-popup-btn' and @type='button']"));
            }catch(NoSuchElementException e){
                System.out.println(" window button locator is not working " + e);
            }
            String parentWindow = driver.getWindowHandle();
            System.out.println(driver.getTitle());
            window.click();

            try{
                Set<String> childWindow = driver.getWindowHandles();
                Iterator<String> it = childWindow.iterator();
                if(it.hasNext()){
                    driver.switchTo().window(it.next());
                    System.out.println(driver.getTitle());

                }



            }catch(Exception e){
                System.out.println(" child window is not open");
            }
//            finally{
//                driver.close();
//                System.out.println("child window is closed");
//            }
//            driver.close();
//            driver.switchTo().defaultContent();

        }
        catch(Exception e){
            System.out.println(" Error " + e);
        }
        finally{
            driver.close();
        }
    }
}
