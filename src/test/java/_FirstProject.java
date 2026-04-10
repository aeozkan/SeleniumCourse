import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class _FirstProject {
    public static void main(String[] args) throws InterruptedException {
// ChromeDriver'ı otomatik olarak yönetmek ve sistemimize uygun olanı kullanmak için WebDriverManager'ı başlat.
        WebDriverManager.chromedriver().setup();

// ChromeDriver nesnesi oluşturulup WebDriver tipindeki driver referansına atandı.
        WebDriver driver = new ChromeDriver();

// Belirtilen URL'ye gitmek için get() metodunu kullan.
        driver.get("https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api");

// Tarayıcı penceresini tam ekran yapmak için maximize() metodunu kullan.
        driver.manage().window().maximize();

// Sayfa yüklendiğinde elemanları bulamazsa, 15 saniye boyunca tekrar denemesini sağlıyoruz.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

// Kodun 3 saniye beklemesini sağlıyoruz.
        Thread.sleep(3000);

// Tarayıcıyı kapatıyoruz, böylece test tamamlandığında kaynakları serbest bırakıyoruz.
        driver.quit(); //tarayıcıyı kapatır
        driver.close(); //sekmeyi kapatır
    }
}
