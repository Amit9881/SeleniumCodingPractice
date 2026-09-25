package SeleniumTerms.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class multiplwSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationcentral.com/demo/dropdown.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//button[@data-target='multi-select-dropdown']")
        ).click();

        Select sel = new Select(driver.findElement(
                By.xpath("//select[@class='form-multiselect block w-full mt-1']")
        ));
        sel.selectByIndex(3);
        Thread.sleep(500);
        sel.selectByValue("option3");
        Thread.sleep(500);
        sel.selectByVisibleText("Option 5");
        Thread.sleep(500);
        sel.deselectByValue("option3");
        Thread.sleep(500);
        driver.close();

    }
}
