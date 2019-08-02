import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTest {
    public static WebDriver driver;

   @BeforeSuite
    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mortu\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

            @Test
            public void doLogin() throws MalformedURLException, InterruptedException {
        driver.get("https://www.gmail.com");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
               // Thread.sleep(3000);
        driver.findElement(By.id("identifierId")).sendKeys("mortuzakamal2010@gmail.com");
                Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
                Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("abvd");
            }
            @AfterSuite
    public void tearDown() throws InterruptedException {
       Thread.sleep(3000);
        driver.quit();
            }
}
