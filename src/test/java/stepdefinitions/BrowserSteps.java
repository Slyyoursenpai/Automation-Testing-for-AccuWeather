package stepdefinitions;

import io.cucumber.java.en.When;
import utils.BrowserUtils;

import static io.qameta.allure.Allure.step;

public class BrowserSteps {

    @When("I go back to the previous page")
    public void navigateBackToPreviousPage() {
        step("Navigates back to previous page");
        BrowserUtils.navigateBack();
    }
}
