package hooks;

import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SettingsTestData;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static io.qameta.allure.Allure.step;

public class Hooks {

    @Before
    public void setup() {
        step("Open Browser with Maximized Window");
        getBrowser().maximize();
        step("Navigate to website from host data URL");
        getBrowser().goTo(SettingsTestData.getEnvData().getHost());
    }

    @After
    public void teardown() {
        step("Quit Browser");
        if (AqualityServices.isBrowserStarted()) {
            getBrowser().quit();
        }
    }
}
