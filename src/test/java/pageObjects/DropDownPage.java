package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    // Homework
    Select obj;

    public DropDownPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "https://uprightforum.tech/practice/")
        WebElement practiceLinkPath;
    @FindBy(xpath = "//select[@class= 'form-control']")
    WebElement selectPath;


    public void clickOnPractice(){
        practiceLinkPath.click();

    }

    public void clickOnSelectAnOption(){
         obj = new Select(selectPath);
       // obj.selectByVisibleText("Select an option");
obj.selectByIndex(0);
    }

    public void clickOnOptionOne() throws InterruptedException {
        Thread.sleep(3000);
        obj.selectByIndex(1);
    }

    public void clickOnOptionTwo() throws InterruptedException {
        Thread.sleep(3000);
        obj.selectByIndex(2);
    }
    public void clickOnOptionThree() throws InterruptedException {
        Thread.sleep(3000);
        obj.selectByIndex(3);
    }










}
