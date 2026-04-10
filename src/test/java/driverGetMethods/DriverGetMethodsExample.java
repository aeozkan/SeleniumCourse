package driverGetMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverGetMethodsExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//1.Amazon Sayfasina Gidelim.
        String baseUrl = "https://www.amazon.com.tr/";
        driver.get(baseUrl);

//2.Sayfa Başlığını Yazdırın
        System.out.println("Title: " + driver.getTitle());

//3.Sayfa başlığının amazon içerdiğini test edin
            String actualTitle = driver.getTitle();
        String expectTitle = "amazon";
        if(actualTitle.contains(expectTitle)){
            System.out.println("Title Testing Passed");
        }else{
            System.out.println("Title Testing Failed");
        }

//4.Sayfa adresini url yazdırın
        System.out.println("URL: " + driver.getCurrentUrl());

//5.Sayfa urlnin amazon içerdiğini test edin
        String actualUrl = driver.getCurrentUrl();
        String expectUrl = "amazon";
        if(actualUrl.contains(expectUrl)){
            System.out.println("URL Testing Passed");
        }else{
            System.out.println("URL Testing Failed");
        }

//6.Sayfa Handle değerini yazdırın
        System.out.println("Handle değeri: " + driver.getWindowHandle());

//7.Sayfa html kodlarında "shopping" kelimesi geçtiğini test edin
        String actualSourceCode = driver.getPageSource();
        String expectSourceCode = "Integration";
        if(actualSourceCode.contains(expectSourceCode)){
            System.out.println("Page Source Code Testing Passed");
        }else{
            System.out.println("Page Source Code Testing Failed");
        }
//8.Sayfayı kapatın.
        driver.quit();

    }
}
