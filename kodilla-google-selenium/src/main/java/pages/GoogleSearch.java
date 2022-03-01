package pages;

public class GoogleSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
    }
}
