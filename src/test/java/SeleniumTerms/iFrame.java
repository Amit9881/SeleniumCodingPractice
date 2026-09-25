package SeleniumTerms;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class iFrame {
    public static void main(String[] args){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(option);
        try {
            driver.get("https://testautomationcentral.com/demo/frames_iframes.html");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement frmaeButton = null;
            try {
                frmaeButton = driver.findElement(By.xpath("//button[@data-target='iframe-tab']"));
            } catch (NoSuchElementException e) {
                System.out.println("Please check FrameeButton xpath " + e);
            }
            frmaeButton.click();
            WebElement frame = null;
            try{
                frame = driver.findElement(By.xpath("//iframe[@class ='w-full h-64 border']"));
            }
            catch(NoSuchFrameException e){
                System.out.println(" check the frame xpath " + e);
            }
            driver.switchTo().frame(frame);
            driver.switchTo().defaultContent();
        }catch(Exception e){
            System.out.println(" Error " + e);
        }
        finally{
            driver.close();
        }
    }

}
