package UI.Pages;

import UI.Utils.TestConstants;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Log4j2
public class CreateNewDefectPage implements TestConstants {
    public SelenideElement pageTitle = $x("//h1[text()='Create defect']");
    public SelenideElement defectTitle = $(By.id("title"));
    public SelenideElement defectActualResult = $x("//p[@class='empty-node']");
    public SelenideElement saveDefectButton = $x("//button[text()='Create defect']");

    @Step("Creation of a new defect with {title} as a title and {result} as a result")
    public void defectCreation(String title, String result){
        log.info("Set {} as a title",title);
        defectTitle.sendKeys(title);
        log.info("Set {} as a result",result);
        defectActualResult.sendKeys(result);
    }

    @Step("Click save defect button and open List of defects page")
    public ListOfDefectsPage saveDefect(){
        log.info("Click save defect button and open List of defects page");
        saveDefectButton.click();
        return new ListOfDefectsPage();
    }
}
