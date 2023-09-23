package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AlertPage;
import utilities.BaseClass;

import java.util.List;

public class Alert {
    AlertPage alertPage;

    /* How to implement alert
    driver.switchto().alert.accept();
    driver.switchto().alert. dismiss();
    driver.switchto().alert.getText();


     */

//  WebDriver driver;- no need because driver use from base class and  set it here in parameter as BaseClass.getdriver .
//
    @Given("browser is open and navigate to the Base URL")
    public void browser_is_open_and_navigate_to_the_base_url() throws InterruptedException {


    }


    @When("user click on Try it")
    public void user_click_on_try_it() {
//   *Setup in page class*     WebElement tryItPath = driver.findElement(By.xpath("//button[@class ='onclick']"));
//        tryItPath.click(); // Browser pop up will open
        alertPage = new AlertPage(BaseClass.getDriver());
        alertPage.clickOnTryIt();

    }

    @Then("Alert box is present")
    public void alert_box_is_present() {
//   *Setup in page class*     driver.switchTo().alert().getText();
//        String alertText =  driver.switchTo().alert().getText();
//       if(alertText.contains("alert"))
//           System.out.println("Alert box is present");
//       else
//           System.out.println("Alert box is not present");
        alertPage.validateAlertBox();

    }

    @Then("User should be able to click on Ok")
    public void user_should_be_able_to_click_on_ok() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.switchTo().alert().accept();
        alertPage.acceptAlert();


    }

    // work on below
//    @When("User navigate inside the iframe")
//    public void user_navigate_inside_the_iframe() {
//        WebElement iFramePath = driver.findElement(By.xpath("//iframe[@src = \"https://uprightforum.tech\"]"));
//        driver.switchTo().frame(iFramePath);// cursor able to click inside the box
//
//    }
//
//    @Then("User  should be able to click on practice page")
//    public void user_should_be_able_to_click_on_practice_page() {
//        WebElement practiceLink = driver.findElement(By.xpath("//a[text() = 'Practice']"));
//        practiceLink.click();
//
//    }
//
//    @Then("User can click on alert inside the Iframe")
//    public void user_can_click_on_alert_inside_the_iframe() {

 //   }




}
