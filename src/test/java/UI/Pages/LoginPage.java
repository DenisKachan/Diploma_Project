package UI.Pages;

import Utils.PropertyReader;
import Utils.TestConstants;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Log4j2
public class LoginPage implements TestConstants {
    public SelenideElement emailInput = $("#inputEmail");
    public SelenideElement passwordInput = $x("//input[@type='password']");
    public SelenideElement loginButton = $(By.id("btnLogin"));
    public SelenideElement errorMessage = $x("//div[contains(@class,'error')]/div");

    @Step("Setting {email} as an email and {password} as a password")
    public void login(String email, String password) {
        log.info("Set {} as an email",email);
        emailInput.sendKeys(email);
        log.info("Set {} as a password",password);
        passwordInput.sendKeys(password);
        log.info("Click login button");
    }
    @Step("Login with valid data")
    public void successfulLogin() {
        PropertyReader propertyReader = new PropertyReader();
        login(propertyReader.getProperty("email"), propertyReader.getProperty("password"));
        clickLoginButton();
    }

    @Step("Click login button and open List of projects page")
    public ListOfProjectsPage clickLoginButton(){
        log.info("Click login button and open List of projects page");
        loginButton.click();
        return new ListOfProjectsPage();
    }




}