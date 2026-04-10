import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class amazonTestCase {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // amazon.com'a gir, search barda kelime arat, sayfada gözüken "sonuçlar" text'îni yazdır
        String baseUrl = "https://www.amazon.com.tr/";
        driver.get(baseUrl); // amazon.com'a giriş
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")); //search bar elementini bulma
        aramaKutusu.sendKeys("selenium"); // search bar'a kelime yazdırma
        aramaKutusu.submit(); // enter tuşu
        WebElement sonucYazisi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none s-breadcrumb-header-text']")); // "sonuçlar text'ini bulma
        System.out.println(sonucYazisi.getText()); // "sonuçlar" text'ini yazdırma
        driver.quit();
    }
}
