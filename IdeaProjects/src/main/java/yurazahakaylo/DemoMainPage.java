package yurazahakaylo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoMainPage
{

    private static final String BASE_URL = "https://demo.opencart.com";
    private WebDriver driver;
    public DemoMainPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void open()
    {
        driver.get(BASE_URL);
    }

    WebElementReturn ElementReturn = new WebElementReturn();

    @FindBy(linkText = "My Account")
    public WebElement personalCabinetLink;



    @FindBy(linkText = "Register")
    private WebElement registerLink;

    //Register Account

    @FindBy(id = "input-firstname")
    public WebElement firstNameFlat;

    @FindBy(id = "input-lastname")
    public WebElement lastNameFlat;

    @FindBy(id = "input-email")
    public WebElement eMailFlat;

    @FindBy(id = "input-telephone")
    public WebElement telephoneFlat;

    @FindBy(id = "input-password")
    public WebElement passwordFlat;

    @FindBy(id = "input-confirm")
    public WebElement passwordConfirmFlat;

    @FindBy(name = "agree")
    public WebElement agreePrivacyPolicy;

    @FindBy(className = "btn-primary")
    public WebElement toContinue;

    //WebElement personalCabinetLink = ElementReturn.getPersonalCabinetLink();
  //private   WebElement registerLink = ElementReturn.getRegist();
   /* private WebElement firstNameFlat = ElementReturn.getFirstNameFlat();
    WebElement lastNameFlat = ElementReturn.getLastNameFlat();
    WebElement eMailFlat = ElementReturn.geteMailFlat();
    WebElement telephoneFlat = ElementReturn.getTelephoneFlat();
    WebElement passwordFlat = ElementReturn.getpasswordFlat();
    WebElement passwordConfirmFlat = ElementReturn.getPasswordConfirmFlat();
    WebElement agreePrivacyPolicy = ElementReturn.getAgreePrivacyPolicy();
    WebElement toContinue = ElementReturn.getToContinue();*/


    public void clickOnPersonalCabinet(){ personalCabinetLink.click(); }
    public void clickOnRegistration(){ registerLink.click();}

    public void clickOnFirstNameFlat(){ firstNameFlat.click();}
    public void enterFirstName() {firstNameFlat.sendKeys("Chornuy");}

    public void clickOnLastNameFlat(){ lastNameFlat.click();}
    public void enterLastName() {lastNameFlat.sendKeys("Vlastelin");}

    public void clickOnEMailFlat(){ eMailFlat.click();}
    public void enterEMail() {eMailFlat.sendKeys("miyemail@gmail.com");}

    public void clickOnTelephoneFlat(){ telephoneFlat.click();}
    public void enterTelephone() {telephoneFlat.sendKeys("26589426444");}

    public void clickOnPasswordFlat(){ passwordFlat.click();}
    public void enterPassword() {passwordFlat.sendKeys("9866");}

    public void clickOnPasswordConfirmFlat(){ passwordConfirmFlat.click();}
    public void enterPasswordConfirm() {passwordConfirmFlat.sendKeys("9866");}

    public void clickToAgreePrivacyPolicy(){ agreePrivacyPolicy.click();}
    public void clickToContinue(){ toContinue.click();}

}
