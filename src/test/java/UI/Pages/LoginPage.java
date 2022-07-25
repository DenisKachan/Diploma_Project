package UI.Pages;

import UI.Utils.TestConstants;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage implements TestConstants {
    public SelenideElement emailInput = $("#inputEmail");
    public SelenideElement passwordInput = $x("//input[@type='password']");
    public SelenideElement loginButton = $(By.id("btnLogin"));
    public SelenideElement errorMessage = $x("//div[contains(@class,'error')]/div");

    public void login(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public ListOfProjectsPage successfulLogin() {
        login(VALID_EMAIL, VALID_PASSWORD);
        return new ListOfProjectsPage();
    }

    public LoginPage loginWithInvalidData() {
        login(INVALID_EMAIL, INVALID_PASSWORD);
        return this;
    }

}