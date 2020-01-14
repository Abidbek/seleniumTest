package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.Keys.ENTER;

public class  ChromeTest {
    @Test
    public void testPartialLink(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        driver.findElement(By.partialLinkText("How Search works")).click();
        String expectedString= "Discover How Google Search Works";
        Assert.assertTrue(driver.getTitle().contains(expectedString));
        driver.close();
    }
    @Test
    public void testExpediaWebPage(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.expedia.com");
        driver.findElement(By.xpath("//*[@id='package-origin-hp-package']")).sendKeys("Chicago"+ ENTER);
        driver.close();
    }
}
