package UI.Tests;

import UI.BrowserConfig.SelenideConfiguration;
import UI.Steps.*;
import UI.Utils.PropertyReader;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.Optional;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    protected LoginSignOutSteps loginSignOutSteps;
    protected ProjectSteps projectSteps;
    protected CaseSteps caseSteps;
    protected SuiteSteps suiteSteps;
    protected TestRunSteps testRunSteps;
    protected DefectsSteps defectsSteps;

    @BeforeMethod
    public void setUp() {
        PropertyReader propertyReader = new PropertyReader();
        String browser = Optional.ofNullable(propertyReader.getProperty("browser")).orElse("chrome");
        SelenideConfiguration.configureBrowser(browser);
        open("login");
        loginSignOutSteps = new LoginSignOutSteps();
        projectSteps = new ProjectSteps();
        caseSteps = new CaseSteps();
        suiteSteps = new SuiteSteps();
        testRunSteps = new TestRunSteps();
        defectsSteps = new DefectsSteps();
    }

    @AfterMethod
    public void closeBrowser() {
        WebDriverRunner.closeWebDriver();
    }
}
