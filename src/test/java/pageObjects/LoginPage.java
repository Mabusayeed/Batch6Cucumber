package pageObjects;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    // Homework


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
        //org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"link text","selector":"//a[text()='Practice']"}
    @FindBy(xpath = "//i[@class = 'fas fa-user']")
    WebElement loginLinkPath;



    @FindBy(xpath = "//input[@id = 'username-44']")
    WebElement userNamePath;


    @FindBy(xpath = "//input[@id = 'user_password-44']")
    WebElement passWordPath;


    @FindBy(xpath = "//input[@id = 'um-submit-btn']")
    WebElement loginButtonPath;

    @FindBy(xpath = "//span[contains(text(), 'Abusayeed')]")
    WebElement nameDisplayPath;

    @FindBy(xpath = "//a[text()='My Account']")
    WebElement myAccountPath;



    public void clickOnLogin() {
        loginLinkPath.click();

    }

    public void enterUserName() {
        userNamePath.click();
    }

    public void enterPassword() {
        passWordPath.click();
    }

    public void clickOnSubmitButton(){
        loginButtonPath.click();
    }

    public void validateMyName(){
      String myName =   nameDisplayPath.getText();
        if (myName.equalsIgnoreCase("Abusayeed")){
            System.out.println("I am logged in ");
        }
        else {
            System.out.println("I am not logged in ");
        }
    }

    public void validateMyAccount() {
        myAccountPath.click();
    }










}
