package UI.Steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class LoginSignOutSteps extends BaseStep {


    @Step("Login with correct data")
    public void successfulLogin() {
        loginPage.successfulLogin();
        listOfProjectsPage.createButton.shouldBe(Condition.visible);
    }

    @Step("Login with invalid data")
    public void loginWithInvalidData() {
        loginPage.loginWithInvalidData();
        loginPage.errorMessage.shouldBe(Condition.visible);
    }

    public void successfulSignOut() {
        loginPage.successfulLogin();
        listOfProjectsPage.signOut();
        loginPage.loginButton.shouldBe(Condition.visible);
    }
}