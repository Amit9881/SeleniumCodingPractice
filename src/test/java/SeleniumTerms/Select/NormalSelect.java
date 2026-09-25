package SeleniumTerms.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NormalSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationcentral.com/demo/dropdown.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@data-target='styled-dropdown']")).click();
        WebElement val = driver.findElement(By.xpath("//select[@class='form-select block w-full mt-1 border-blue-500 text-blue-500']"));
        Select dropDown = new Select(val);
        dropDown.selectByIndex(1);
        Thread.sleep(1000);
        driver.close();
    }
}
