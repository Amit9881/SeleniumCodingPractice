package SeleniumTerms.Select;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class dynamicDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationcentral.com/demo/dropdown.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//button[@data-target='styled-dropdown']")
        ).click();
        Select sel = new Select(driver.findElement(
                By.xpath("//select[@class='form-select block w-full mt-1 border-blue-500 text-blue-500']")
        ));
        sel.selectByIndex(2);
        Thread.sleep(1000);
        driver.close();
    }}
