package UI.Tests;

import UI.BrowserConfig.SelenideConfiguration;
import UI.Steps.*;
import Utils.PropertyReader;
import Utils.TestListener;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.TmsLink;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.util.Optional;
import static com.codeborne.selenide.Selenide.open;

@TmsLink("DIPLOMA")
@Listeners(TestListener.class)
public class BaseTest {

    protected LoginSignOutSteps loginSignOutSteps;
    protected ProjectSteps projectSteps;
    protected CaseSteps caseSteps;
    protected SuiteSteps suiteSteps;
    protected TestRunSteps testRunSteps;
    protected DefectsSteps defectsSteps;

    @BeforeMethod(description = "Opening browser")
    public void setUp() {
        PropertyReader propertyReader = new PropertyReader();
        String browser = Optional.ofNullable(propertyReader.getProperty("browser")).orElse("chrome");
        SelenideConfiguration.configureBrowser(browser);
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
                .includeSelenideSteps(true)
        );
        open("login");
        loginSignOutSteps = new LoginSignOutSteps();
        projectSteps = new ProjectSteps();
        caseSteps = new CaseSteps();
        suiteSteps = new SuiteSteps();
        testRunSteps = new TestRunSteps();
        defectsSteps = new DefectsSteps();
    }

    @AfterMethod(description = "Closing browser")
    public void closeBrowser() {
        WebDriverRunner.closeWebDriver();
    }
}
