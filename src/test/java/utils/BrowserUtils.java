package utils;

import aquality.selenium.browser.AqualityServices;
import lombok.experimental.UtilityClass;

@UtilityClass
public class BrowserUtils {

    public void navigateBack() {
        AqualityServices.getBrowser().goBack();
    }
}
