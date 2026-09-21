import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mvnrepository.com/");
        driver.manage().window().maximize();
        //driver.navigate().back();
        driver.close();

    }
}
