package UI.Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Log4j2
public class ListOfDefectsPage {

    public SelenideElement createNewDefectButton = $x("//a[@class='btn btn-primary']");
    public SelenideElement createdDefectTitle = $(By.id("defect-1-title"));

    @Step("Click create new defect button and open Create new defect page")
    public CreateNewDefectPage clickCreateNewDefectButton(){
        log.info("Click create new defect button and open Create new defect page");
        createNewDefectButton.click();
        return new CreateNewDefectPage();
    }
}
