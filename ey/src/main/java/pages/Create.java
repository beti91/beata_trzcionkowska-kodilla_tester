package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create {
    WebDriver driver;

    public Create(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(className="login")
    WebElement signInButton;

@FindBy(xpath="//*[@id=\"email_create\"]")
    WebElement EmailAddress;

@FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
    WebElement CreateAnAccountButton;

@FindBy(xpath = "//*[@id=\"id_gender2\"]")
    WebElement Tittle;

@FindBy(xpath = "//*[@id=\"customer_firstname\"]")
    WebElement FirstName;

@FindBy(xpath = "//*[@id=\"customer_lastname\"]")
    WebElement LastName;

@FindBy(xpath = "//*[@id=\"email\"]")
    WebElement Email;

@FindBy(xpath = "//*[@id=\"passwd\"]")
    WebElement Password;

@FindBy(xpath = "//*[@id=\"days\"]")
    WebElement DayOfBirth;

@FindBy(xpath = "//*[@id=\"months\"]")
    WebElement MonthOfBirth;

@FindBy(xpath = "//*[@id=\"years\"]")
    WebElement YearOfBirth;

@FindBy(xpath = "//*[@id=\"newsletter\"]")
    WebElement Newsletter;

@FindBy(xpath = "//*[@id=\"optin\"]")
    WebElement SpecialOffers;

@FindBy(xpath = "//*[@id=\"firstname\"]")
    WebElement FirstNameAddress;

@FindBy(xpath = "//*[@id=\"lastname\"]")
    WebElement LastNameAddress;

@FindBy(xpath = "//*[@id=\"company\"]")
    WebElement Company;

@FindBy(xpath = "//*[@id=\"address1\"]")
    WebElement Address;

@FindBy(xpath = "//*[@id=\"address2\"]")
    WebElement AddressLine2;

@FindBy(xpath = "//*[@id=\"city\"]")
    WebElement City;

@FindBy(xpath = "//*[@id=\"id_state\"]")
    WebElement State;

@FindBy(xpath = "//*[@id=\"postcode\"]")
    WebElement Postcode;

@FindBy(xpath = "//*[@id=\"id_country\"]")
    WebElement Country;

@FindBy(xpath = "//*[@id=\"other\"]")
    WebElement AdditionalInformation;

@FindBy(xpath = "//*[@id=\"phone\"]")
    WebElement HomeNumber;

@FindBy(xpath = "//*[@id=\"phone_mobile\"]")
    WebElement MobilePhone;

@FindBy(xpath = "//*[@id=\"alias\"]")
    WebElement AliasAddress;

@FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
WebElement RegisterButton;

    public void login(){
        signInButton.click();
    }
    public void enterEmailAddress(String addressEmail){
        EmailAddress.sendKeys(addressEmail);
    }

public void createButton() {
        CreateAnAccountButton.click();
}

}
