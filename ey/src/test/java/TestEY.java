import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Create;
import pages.WelcomePage;


public class TestEY {

    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com");
    }

    @Test
    public void correctLogin(){

String addressEmail = "addressEmail@.pl";
String name = "name";
String lastName = "lastName";
String password = "12345678";
String street ="street";
String city = "city";
String zip = "11111";
String homeNumber = "111111111";

        Create create = new Create(driver);

        create.login();
        create.enterEmailAddress(addressEmail);
        create.createButton();
        create.tittle();
        create.loginName(name);
        create.lastNameLogin(lastName);
        create.setPassword(password);
        create.setDayOfBirth();
        create.setMonthOfBirth();
        create.setYearOfBirth();
        create.setStreet(street);
        create.setCity(city);
        create.setState();
        create.setZip(zip);
        create.setHomeNumber(homeNumber);
        create.registerButton();

        WelcomePage welcomePage = new WelcomePage(driver);

        Assert.assertTrue(welcomePage.getWelcomeText().contains("Welcome to your account. Here you can manage all of your personal information and orders."));
    }


}
