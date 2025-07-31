package pages;

import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.List;

public class MainPage extends Form {
    private final IButton consentButton = getElementFactory().getButton(By.cssSelector(".policy-accept"), "Consent Button");
    private final ITextBox searchField = getElementFactory().getTextBox(By.className("search-input"), "Search Field");
    private final ILabel resultList = getElementFactory().getLabel(By.className("results-container"), "Result List");
    private final ILabel currentLocationLabel = getElementFactory().getLabel(By.className("current-location-result"), "Current Location Label");
    private final By searchResult = By.className("search-bar-result__name");
    private final By recentLocation = By.className("recent-location-item");

    public MainPage() {
        super(By.className("page-hero-content"), "Main Page");
    }

    @Step("Accepts Consent Button")
    public void clickConsentButton() {
        consentButton.click();
    }

    @Step("Searches for {name} in Text Field")
    public void searchFor(String name) {
        searchField.clearAndType(name);
    }

    @Step("Checks for Search Result List")
    public boolean isSearchResultDisplayed() {
        return resultList.state().waitForDisplayed();
    }

    @Step("Clicks on First Search Result")
    public void clickFirstResult() {
        isSearchResultDisplayed();
        List<ILabel> list = getElementFactory().findElements(searchResult, ElementType.LABEL);
        list.get(0).click();
        this.state().waitForNotDisplayed();
    }

    @Step("Selects first name from recent section")
    public void clickFirstRecentResult() {
        List<ILabel> list = getElementFactory().findElements(recentLocation, ElementType.LABEL);
        list.get(0).click();
    }

    @Step("Clicks Search bar")
    public void clickSearchField() {
        searchField.click();
    }

    @Step("Checks for presence of current location label")
    public boolean isCurrentLocationLabelDisplayed() {
        return currentLocationLabel.state().waitForDisplayed();
    }
}
