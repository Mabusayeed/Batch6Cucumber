package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseClass;

import java.time.Duration;

public class AlertPage {

    /*
    In a Page class-
    1.constructor
    2.Page elements
    3. Method according to action


     */
    public AlertPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//button[@class ='onclick']")
    WebElement tryItPath;

    public void clickOnTryIt() {
        tryItPath.click();

    }

    public void validateAlertBox() {

        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        String alertText = BaseClass.getDriver().switchTo().alert().getText();
        System.out.println(alertText);
        if (alertText.contains("knowledge"))
            System.out.println("Alert box is present");
        else
            System.out.println("Alert box is not present");

    }
    public void acceptAlert() throws InterruptedException {

        Thread.sleep(3000);
      BaseClass.getDriver().switchTo().alert().accept();
    }

}




