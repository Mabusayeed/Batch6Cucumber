package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.DropDownPage;
import utilities.BaseClass;

public class DropDown {

     /* Dropdown can use multiple ways
        1. Selectbyvisibletext
        2. Selectbyindex
        3. SelectbyValue

         */

    WebDriver driver;
    Select dropdown;
    DropDownPage dropDownPage;


//    @Given("browser is open and navigate to the Base URL")
//    public void browser_is_open_and_navigate_to_the_base_url() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(); // open the browser
//        driver.get("https://uprightforum.tech");// Navigate the base URL
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//
//    }


    @Given("user navigate to practice page")
    public void user_navigate_to_practice_page() {
        //  WebElement practiceLink = driver.findElement(By.xpath("//a[text()='Practice']"));
        // practiceLink.click();


      //  dropDownPage.clickOnPractice();
    }


    @When("user see the Select an option")
    public void user_see_the_select_an_option() {
        dropDownPage = new DropDownPage(BaseClass.getDriver());
        dropDownPage.clickOnSelectAnOption();

    }

    @Then("user can select option one")
    public void user_can_select_option_one() throws InterruptedException {
        dropDownPage.clickOnOptionOne();

    }

    @Then("user can select option two")
    public void user_can_select_option_two() throws InterruptedException {

        dropDownPage.clickOnOptionTwo();
    }

    @Then("user can select option three")
    public void user_can_select_option_three() throws InterruptedException {
        dropDownPage.clickOnOptionThree();


    }
}