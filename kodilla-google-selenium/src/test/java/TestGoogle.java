import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestGoogle {
    WebDriver driver;


    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("http://wwww.google.com");
    }

    public void tearDown() {
        driver.close();                   // [1]
    }

    @Test
    public void testGooglePage() {

    }
}

