package hu.masterfield;


import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWSWTests {

    @Test
    public void TC1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.hwsw.hu");

        Thread.sleep(10000);

        driver.quit();
    }
}
