package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.util.Set;

public class WindowPage {

    public WindowPage(WebDriver driver){
        PageFactory.initElements(driver, this );

    }

    @FindBy(xpath = "//button[@id = 'openwindow']")
    WebElement openWindowPath;

    public void clickOnWindow() {
    openWindowPath.click();

    }

    public void switchingToNewWindow() {
        String firstWindowID = BaseClass.getDriver().getWindowHandle();
        System.out.println(firstWindowID);
        Set<String> multipleIDs =  BaseClass.getDriver().getWindowHandles();
        System.out.println(multipleIDs.size());
    }





}
