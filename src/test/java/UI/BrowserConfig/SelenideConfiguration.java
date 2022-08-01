package UI.BrowserConfig;

import UI.Utils.PropertyReader;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Browsers.*;

public class SelenideConfiguration {
    public static void configureBrowser(String browser) {
        setUpBasicConfigure();

        switch (browser) {
            case "safari":
                Configuration.browser = SAFARI;
                break;
            case "firefox":
                Configuration.browser = FIREFOX;
                break;
            default:
                Configuration.browser = CHROME;
                break;
        }
    }

    public static void setUpBasicConfigure() {
        PropertyReader propertyReader = new PropertyReader();
        Configuration.baseUrl = propertyReader.getProperty("baseUrl");
        Configuration.headless = Boolean.parseBoolean(propertyReader.getProperty("headless"));
        Configuration.browserSize = propertyReader.getProperty("browserSize");
        Configuration.timeout = Long.parseLong(propertyReader.getProperty("timeout"));
        Configuration.screenshots = Boolean.parseBoolean(propertyReader.getProperty("screenshots"));

    }
}
