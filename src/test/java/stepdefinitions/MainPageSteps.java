package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

public class MainPageSteps {

    private final MainPage mainPage = new MainPage();

    @When("I consent to data usage")
    public void consentDataUsage() {
        mainPage.clickConsentButton();
    }

    @When("I input {string} in the search field in the Main Page")
    public void searchCity(String name) {
        mainPage.searchFor(name);
    }

    @Then("I should see a search results list in the Main Page")
    public void verifyResultList() {
        Assert.assertTrue(mainPage.isSearchResultDisplayed(), "Result list is not displayed");
    }

    @When("I click on the first search result")
    public void clickFirstResult() {
        mainPage.clickFirstResult();
    }

    @Then("Main Page is displayed")
    public void verifyMainPage() {
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main Page is not displayed");
    }

    @When("I choose the first city in Recent Locations")
    public void clickFirstRecentResult() {
        mainPage.clickFirstRecentResult();
    }

    @When("I click on the search field")
    public void clickSearchBar() {
        mainPage.clickSearchField();
    }

    @Then("current location label is displayed")
    public void verifyCurrentLocationLabel() {
        Assert.assertTrue(mainPage.isCurrentLocationLabelDisplayed(), "Current Location Label is not displayed");
    }
}
