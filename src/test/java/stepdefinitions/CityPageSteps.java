package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CityPage;

import static io.qameta.allure.Allure.step;

public class CityPageSteps {

    private final CityPage cityPage = new CityPage();

    @Then("City weather page header contains {string}")
    public void verifyCityName(String expectedName) {
        step("Obtains name of city from header page in String form");
        String city = cityPage.getCityName();
        step("Asserts to check if header name contains expected city name");
        Assert.assertTrue(city.contains(expectedName), "Does not contain expected City Name");
    }
}
