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

    public ListOfDefectsPage defectCreation(String title, String result){
        defectTitle.sendKeys(title);
        defectActualResult.sendKeys(result);
        saveDefectButton.click();
        return new ListOfDefectsPage();
    }
}
