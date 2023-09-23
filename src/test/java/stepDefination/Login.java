package stepDefination;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AlertPage;
import pageObjects.LoginPage;
import utilities.BaseClass;

import java.util.List;

public class Login {

    // WebDriver driver; ** line number 39 where it says (BaseClass.getDriver() function same as WebDriver driver

    LoginPage loginPage;

    //  @Given("browser is open and navigate to the Base URL")
    //public void browser_is_open_and_navigate_to_the_base_url() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver(); // open the browser
//            driver.get("https://uprightforum.tech");// Navigate the base URL
//            driver.manage().window().maximize();
//            Thread.sleep(3000);


    @Given("user navigate to the login page")
    public void user_navigate_to_the_login_page() {
//        WebElement loginLinkPath = driver.findElement(By.xpath("//i[@class = 'fas fa-user']"));
//            loginLinkPath.click();

        loginPage = new LoginPage(BaseClass.getDriver());
        loginPage.clickOnLogin();


    }

    @When("user enter valid {string}")
    public void user_enter_valid_username(String username) {
        loginPage.enterUserName();

    }

    @When("user enter a valid {string}")
    public void user_enter_password(String password) {
        loginPage.enterPassword();

    }

    @When("user click on login Button")
    public void user_click_on_login_button() {
        loginPage.clickOnSubmitButton();

    }

    // ask for assistance to separate web elements!!

    @Then("Validate that user is navigated to the home page")
    public void validate_that_user_is_navigated_to_the_home_page() {

        loginPage.validateMyName();

    }

}





