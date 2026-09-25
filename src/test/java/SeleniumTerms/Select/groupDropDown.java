package SeleniumTerms.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class groupDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationcentral.com/demo/dropdown.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath
                ("//button[@data-target='grouped-dropdown']")).click();
        Select sel = new Select(driver.findElement(
                By.xpath("//div[@id='grouped-dropdown']/descendant::select[@class='form-select block w-full mt-1']")
        ));
      //  sel.selectByIndex(2);
        Thread.sleep(200);
        sel.selectByValue("option2");
        Thread.sleep(200);
        sel.selectByVisibleText("Option 4");
        Thread.sleep(200);
//        sel.deselectByVisibleText("Option 4");
//        Thread.sleep(200);
        driver.close();

    }

}
