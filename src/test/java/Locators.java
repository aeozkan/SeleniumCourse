import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        //id ->
        WebElement elementID = driver.findElement(By.id(""));
        //name ->
        WebElement elementNAME = driver.findElement(By.name(""));
        //className ->
        WebElement elementCLASSNAME = driver.findElement(By.className("element_class_name"));
        //tagName ->
        WebElement elementTAGNAME = driver.findElement(By.tagName("element_tag_name"));
        //cssSelector ->
        WebElement elementCSSSELECTOR = driver.findElement(By.cssSelector("element_css_selector"));
        //xpath ->
        WebElement elementXPATH = driver.findElement(By.xpath(""));
        //linkText ->
        WebElement elementLINKTEXT = driver.findElement(By.linkText("element_link_text"));
        //partialLinkText ->
        WebElement elementPARTIALLINKTEXT = driver.findElement(By.partialLinkText("element_partial_link_text"));

    }
}
