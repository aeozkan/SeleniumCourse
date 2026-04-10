import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BestBuyTestCase {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//bestbuy.com'a git, cookies çıkarsa kabul et, sayfada kaç adet buton bulunduğunu yazdır, sayfadaki her bir buton üzerindeki yazıları yazdır

        driver.get("https://www.bestbuy.com/");
        List<WebElement> buton = driver.findElements(By.tagName("button"));
        System.out.println(buton.size());

        for(int i = 0 ; i < buton.size() ; i++){
            System.out.println(buton.get(i).getText());
        }
        driver.quit();




    }
}
