package driverGetMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverGetMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String baseUrl = "https://www.amazon.com.tr/";
//get():
        driver.get(baseUrl);

//getCurrentUrl():
        System.out.println("Sayfanın URL'i: " + driver.getCurrentUrl());

//getTitle():
        System.out.println("Sayfanın başlığı: " + driver.getTitle());

//getPageSource():
        System.out.println("Sayfanın kaynak kodları:\n " + driver.getPageSource());

//getWindowHandle():
        System.out.println("Sayfanın uniq kodu: " + driver.getWindowHandle());

//getClass():
        System.out.println("Driver'ın Class'ı: " + driver.getClass());

//driveri kapat
        driver.quit();



    }
}
