package API.Tests;

import API.Steps.DefectApi;
import API.Steps.ProjectApi;
import org.testng.annotations.BeforeMethod;

public class BaseApiTest {
    public ProjectApi projectApi;
    public DefectApi defectApi;

    @BeforeMethod(description = "Sending requests to server")
    public void setup() {
        projectApi = new ProjectApi();
        defectApi = new DefectApi();
    }
}
