package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Objects;

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
    WebElement AddressStreet;

@FindBy(xpath = "//*[@id=\"address2\"]")
    WebElement AddressLine2;

@FindBy(xpath = "//*[@id=\"city\"]")
    WebElement City;

@FindBy(xpath = "//*[@id=\"postcode\"]")
    WebElement Postcode;


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
public void tittle() {
        Tittle.click();
}
public void loginName(String name){
        FirstName.sendKeys(name);
}
public void lastNameLogin(String lastName){
        LastName.sendKeys(lastName);
}
public void emailCheck(String addressEmail){
        Email.sendKeys(addressEmail);
}
public void setPassword(String password) {
        Password.sendKeys(password);
}
public void setDayOfBirth(){
    WebElement DayOfBirth = driver.findElement(By.xpath("//*[@id=\"days\"]"));
        Select selectDay = new Select(DayOfBirth);
        selectDay.selectByIndex(6);
}
public void setMonthOfBirth(){
    WebElement MonthOfBirth = driver.findElement(By.xpath("//*[@id=\"months\"]"));
        Select selectMonth = new Select(MonthOfBirth);
        selectMonth.selectByIndex(9);
}
public void setYearOfBirth() {
    WebElement YearOfBirth = driver.findElement(By.xpath("//*[@id=\"years\"]"));
        Select selectYear =  new Select(YearOfBirth);
        selectYear.selectByIndex(1991);
}
public void setFirstNameAddress(String name){
        FirstNameAddress.sendKeys(name);
}
public void setLastNameAddress(String lastName){
        LastNameAddress.sendKeys(lastName);
}
public void setCompany(String company){
        Company.sendKeys(company);
}
public void setStreet(String street){
AddressStreet.sendKeys(street);
}
public void setCity(String city){
        City.sendKeys(city);
}
public void setState(){
    WebElement State = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
        Select selectState = new Select(State);
        selectState.selectByIndex(2);
}
public void setZip(String zip){
        Postcode.sendKeys(zip);
}

public void setCountry(){
    WebElement Country = driver.findElement(By.xpath("//*[@id=\"id_country\"]"));
        Select selectCountry = new Select(Country);
        selectCountry.selectByIndex(21);
}
public void setHomeNumber(String homeNumber) {
        HomeNumber.sendKeys(homeNumber);
}
public void setAliasAddress(String alias){
        AliasAddress.sendKeys(alias);
}
public void registerButton(){
        RegisterButton.click();
}

}

