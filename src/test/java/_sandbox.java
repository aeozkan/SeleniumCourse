import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _sandbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String baseURL = "https://demoqa.com/webtables";
        driver.get(baseURL);
        String expectedURL = "";
        String actualBaseURL = baseURL;
        String actualCurruntURL = driver.getCurrentUrl();


//        if(actualBaseURL.contains(expectedURL)){
//            System.out.println("baseURL contain 'google' testi başarılı");
//        }else{
//            System.out.println("baseURL contain 'google' testi başarısız");
//        }
//
//        if(actualBaseURL.equals(expectedURL)){
//            System.out.println("baseURL equals 'google' testi başarılı");
//        }else{
//            System.out.println("baseURL equals 'google' testi başarısız");
//        }
//
//        if(actualCurruntURL.contains(expectedURL)){
//            System.out.println("CurruntURL contain 'google' testi başarılı");
//        }else{
//            System.out.println("CurruntURL contain 'google' testi başarısız");
//        }
//
//        if(actualCurruntURL.equals(expectedURL)){
//            System.out.println("CurruntURL equals 'google' testi başarılı");
//        }else{
//            System.out.println("CurruntURL equals 'google' testi başarısız");
//        }
//
//        driver.manage().window().setPosition(new Point(10,10));
//        driver.manage().window().setSize(new Dimension(200,300));

        driver.findElement(By.xpath("//tr[td/@data-socket-animate-active='gram']"));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));




        driver.quit();
    }
}
