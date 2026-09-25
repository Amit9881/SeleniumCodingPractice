package SeleniumTerms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationcentral.com/demo/dropdown.html");
        Select dropDown = new Select(driver.findElement(By.xpath("//select[@class='form-select block w-full mt-1']")));

        //dropDown.selectByIndex(1);
        dropDown.selectByValue("option2");
        Thread.sleep(1000);
        driver.close();
    }
}
