import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FacebookTestCase {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//facekook'a git, (coockies çıkarsa kabul et), rastgele mail ve şifre gir, giriş yap tıkla, uyarı metnini doğrula(test), sayfayı kapat
        driver.get("https://www.facebook.com/?locale=tr_TR");

        driver.navigate().to("https://www.facebook.com/?locale=tr_TR");
        WebElement emailBox = driver.findElement(By.xpath("//input[@name='email']"));
        emailBox.sendKeys("black_tower_26@hotmail.com");
        WebElement sifreBox = driver.findElement(By.xpath("//input[@name='pass']"));
        sifreBox.sendKeys("26021903Aeo.");

        WebElement girisYapTikla = driver.findElement(By.xpath("//span[@class='x1lliihq x1plvlek xryxfnj x1n2onr6 xyejjpt x15dsfln x193iq5w xeuugli x1fj9vlw x13faqbe x1vvkbs x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x x1sfkdl8 xurcqga x3vd66c xhqx0jl xtk6v10 x1yc453h xudqn12 x3x7a5m']"));
        Thread.sleep(1000);
        girisYapTikla.click();
        Thread.sleep(20000);
        //WebElement robotDegilim = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
        //robotDegilim.click();
        //WebElement digerDiller = driver.findElement(By.xpath("(//div[@class='x9f619 x1n2onr6 x1ja2u2z x78zum5 xdt5ytf x2lah0s x193iq5w xeuugli xv54qhq xf7dkkf x1l90r2v xyamay9'])[8]"));
        //digerDiller.click();
        //WebElement dillerKapat = driver.findElement(By.className("x1lliihq x2lah0s x1k90msu x2h7rmj x1qfuztq x198g3q0 xxk0z11 xvy4d1p"));
        //emailBox.sendKeys("asd");
        WebElement hataMesaji = driver.findElement(By.xpath("//div[@class='x78zum5 xdt5ytf']"));
        String actualHataMsg = hataMesaji.getText();
        Thread.sleep(1000);
        String expectedHataMsg = "Girdiğin giriş bilgileri yanlışasd.";
        if(actualHataMsg.contains(expectedHataMsg)){
            System.out.println("hata mesajı doğru test passed");
        }else{
            System.out.println("hata mesajı farklı test failed");
        }
        driver.quit();
    }
}
