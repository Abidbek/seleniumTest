package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmailAutomation {
    @Test
    public void EmailSending() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Cats" + Keys.ENTER);
        Thread.sleep(3000);
        List<WebElement> videosOnThePage = new ArrayList();
        videosOnThePage=driver.findElements(By.xpath("//*[@role='main']//a[@id='video-title']"));
        Thread.sleep(3000);
        int index = (int)(Math.random()+1)*videosOnThePage.size()-1;
        videosOnThePage.get(index).click();
        driver.close();
    }
    @Test
    public void EmailFromSlack()throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.slack.com/client/TMCBZJ5QS/CNQCVM7HQ");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='domain']")).sendKeys("devxschool"+Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aybekjumabekov@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kuanar1604196227081963"+Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='p-channel_sidebar__jumper_left']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='c-search__input_box']")).click();
        driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("azamat"+Keys.ENTER);
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@data-qa='message_input']")).click();
        driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("    @Test\n" +
                "    public void EmailFromSlack()throws InterruptedException{\n" +
                "        WebDriverManager.chromedriver().setup();\n" +
                "        WebDriver driver = new ChromeDriver();\n" +
                "        driver.get(\"https://app.slack.com/client/TMCBZJ5QS/CNQCVM7HQ\");\n" +
                "        Thread.sleep(3000);\n" +
                "        driver.findElement(By.xpath(\"//input[@id='domain']\")).sendKeys(\"devxschool\"+Keys.ENTER);\n" +
                "        Thread.sleep(3000);\n" +
                "        driver.findElement(By.xpath(\"//input[@id='email']\")).sendKeys(\"aybekjumabekov@gmail.com\");\n" +
                "        driver.findElement(By.xpath(\"//input[@id='password']\")).sendKeys(\"Kuanar1604196227081963\"+Keys.ENTER);\n" +
                "        Thread.sleep(3000);\n" +
                "        driver.findElement(By.xpath(\"//div[@class='p-channel_sidebar__jumper_left']\")).click();\n" +
                "        Thread.sleep(3000);\n" +
                "        driver.findElement(By.xpath(\"//div[@class='c-search__input_box']\")).click();\n" +
                "        driver.findElement(By.xpath(\"//div[@role='textbox']\")).sendKeys(\"Gulbazar\"+Keys.ENTER);\n" +
                "        Thread.sleep(10000);\n" +
                "        driver.findElement(By.xpath(\"//li[@data-index='0']\")).click();\n" +
                "        driver.findElement(By.xpath(\"//div[@role='textbox']\")).sendKeys(\"Hell yeaaaah!!! I got it\"+Keys.ENTER);\n" +
                "\n" +
                "    }"+Keys.ENTER);

    }
}
