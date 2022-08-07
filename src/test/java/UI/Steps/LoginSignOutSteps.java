package UI.Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class LoginSignOutSteps extends BaseStep {

    @Step("Login with established data")
    public LoginSignOutSteps login(String email, String password) {
        loginPage.login(email, password)
                    .clickLoginButton();
        return this;
    }

    @Step("Successful SignOut")
    public LoginSignOutSteps successfulSignOut() {
        loginPage.successfulLogin();
        listOfProjectsPage.signOut();
        return this;
    }

    @Step("Checking for Create new project button to be visible")
    public void successfulLoginChecking(){
        log.info("Checking for Create new project button to be visible");
        listOfProjectsPage.createProjectButton.shouldBe(Condition.visible);
    }

    @Step("Checking for an error message to be visible")
    public void invalidLoginChecking(){
        log.info("Checking for an error message '{}' to be visible", loginPage.errorMessage.getText());
        loginPage.errorMessage.shouldBe(Condition.visible);
    }

    @Step("Checking for a login button to be visible")
    public void successfulSignOutChecking(){
        log.info("Checking for Login button to be visible");
        loginPage.loginButton.shouldBe(Condition.visible);
    }
}