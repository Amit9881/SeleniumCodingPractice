package CSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptions {
    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--start-maximized");
        option.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://www.nseindia.com/");
        driver.close();
    }
}
