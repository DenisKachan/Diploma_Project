package API.Tests;

import API.Steps.ProjectApi;
import org.testng.annotations.BeforeMethod;

public class BaseApiTest {

    public ProjectApi projectApi;

    @BeforeMethod(description = "Sending requests to server")
    public void setup() {
        projectApi = new ProjectApi();
    }
}
