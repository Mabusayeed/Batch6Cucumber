package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.WindowPage;
import utilities.BaseClass;

public class WindowHandling {

    WindowPage windowPage;


    @When("user click on the open window")
    public void user_click_on_the_open_window() {
    windowPage = new WindowPage(BaseClass.getDriver());
    windowPage.clickOnWindow();


    }
    @Then("validate that user can switch to the second window")
    public void validate_that_user_can_switch_to_the_second_window() {
        windowPage.switchingToNewWindow();
    }
    @Then("validate that user can swithch to the second window")
    public void validate_that_user_can_swithch_to_the_second_window() {



    }



}
