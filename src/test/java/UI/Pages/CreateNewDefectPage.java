package UI.Pages;

import UI.Utils.TestConstants;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CreateNewDefectPage implements TestConstants {
    public SelenideElement pageTitle = $x("//h1[text()='Create defect']");
    public SelenideElement defectTitle = $(By.id("title"));
    public SelenideElement defectActualResult = $x("//p[@class='empty-node']");
    public SelenideElement saveDefectButton = $x("//button[text()='Create defect']");

    public ListOfDefectsPage successfulDefectCreation(){
        defectTitle.sendKeys(DEFECT_TITLE);
        defectActualResult.sendKeys(DEFECT_ACTUAL_RESULT);
        saveDefectButton.click();
        return new ListOfDefectsPage();
    }
    public void invalidDefectCreation(){
        defectTitle.sendKeys("");
        defectActualResult.sendKeys(DEFECT_ACTUAL_RESULT);
        saveDefectButton.click();
    }

}
