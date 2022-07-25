package UI.Steps;


import UI.Pages.*;

public class BaseStep {
    protected LoginPage loginPage = new LoginPage();
    protected ListOfProjectsPage listOfProjectsPage = new ListOfProjectsPage();
    protected CreateNewProjectPage createNewProjectPage = new CreateNewProjectPage();
    protected RepositoryPage repositoryPage = new RepositoryPage();
    protected CreateNewCasePage createNewCasePage = new CreateNewCasePage();
    protected CreateNewSuitePage createNewSuitePage = new CreateNewSuitePage();
    protected ListOfTestRunsPage listOfTestRunsPage = new ListOfTestRunsPage();
    protected CreateNewTestRunPage createNewTestRunPage = new CreateNewTestRunPage();
    protected TestRunDetailsPage testRunDetailsPage = new TestRunDetailsPage();
    protected ListOfDefectsPage listOfDefectsPage = new ListOfDefectsPage();
    protected CreateNewDefectPage createNewDefectPage = new CreateNewDefectPage();

}
