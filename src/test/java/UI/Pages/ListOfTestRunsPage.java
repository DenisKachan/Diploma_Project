package UI.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$;

public class ListOfTestRunsPage {
    public SelenideElement createTestRunButton = $(By.id("start-new-test-run-button"));
    public SelenideElement testRunTitle = $x("//td/descendant::a[@class = 'defect-title']");


    public CreateNewTestRunPage clickCreateTestRunButton() {
        createTestRunButton.click();
        return new CreateNewTestRunPage();
    }

    public TestRunDetailsPage openTestRunDetailsPage(){
        testRunTitle.click();
        return new TestRunDetailsPage();
    }

}
