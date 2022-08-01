package UI.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ListOfDefectsPage {
    public SelenideElement createNewDefectButton = $x("//a[@class='btn btn-primary']");
    public SelenideElement createdDefectTitle = $(By.id("defect-1-title"));

    public CreateNewDefectPage clickCreateNewDefectButton(){
        createNewDefectButton.click();
        return new CreateNewDefectPage();
    }

}
