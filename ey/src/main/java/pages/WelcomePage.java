package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

    WebDriver driver;

    @FindBy(className = "info-account")
    WebElement WelcomeText;

    public WelcomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getWelcomeText(){
        return WelcomeText.getText();
    }
}
