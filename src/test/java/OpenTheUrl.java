import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTheUrl {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://chatgpt.com/");
        driver.manage().window().maximize();
        driver.close();
    }
}

