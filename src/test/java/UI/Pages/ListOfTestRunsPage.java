package UI.Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class ListOfTestRunsPage {

    public SelenideElement createTestRunButton = $(By.id("start-new-test-run-button"));
    public SelenideElement testRunTitle = $x("//td/descendant::a[@class = 'defect-title']");

    @Step("Click create test run button and open Create new test run page")
    public CreateNewTestRunPage clickCreateTestRunButton() {
        log.info("Click create test run button and open Create new test run page");
        createTestRunButton.click();
        return new CreateNewTestRunPage();
    }

    @Step("Click test run title and open Test run details page")
    public TestRunDetailsPage openTestRunDetailsPage(){
        log.info("Click test run title and open Test run details page");
        testRunTitle.click();
        return new TestRunDetailsPage();
    }
}
