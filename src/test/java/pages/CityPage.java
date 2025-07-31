package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CityPage extends Form {
    private final ILabel headerName = getElementFactory().getLabel(By.className("header-loc"), "City Header Name");

    public CityPage() {
        super(By.className("header-menu"), "City Page");
    }

    @Step("Function to check whether navigated to city page")
    public String getCityName() {
        return headerName.getText();
    }
}
