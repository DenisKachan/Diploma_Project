package API.Tests;

import API.dto.projects.Project;
import API.dto.projects.Result;
import Utils.TestConstants;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTests extends BaseApiTest implements TestConstants {

    Faker faker = new Faker();

    @Test(description = "Getting project by code using get request")
    public void getProjectByCode(){
        Project actual = projectApi.getProjectByCode("LXBTJGTOAA");
        Assert.assertEquals(actual.getCode(),"LXBTJGTOAA");
    }

    @Test(description = "Creation of a new project using post request")
    public void createProject() {
        String fakeCode = faker.code().ean8();
        Project project = Project.builder().
                code(fakeCode).
                title("TestTitle").
                build();
        projectApi.createNewProject(project);
        Project actual = projectApi.getProjectByCode(fakeCode);
        Assert.assertEquals(project.getCode(), actual.getCode());
    }

    @Test(description = "Delete project with the established code using delete request")
    public void deleteProject(){
        String fakeCode = faker.code().ean8();
        Project project = Project.builder().
                code(fakeCode).
                title("TestTitle").
                build();
        projectApi.createNewProject(project);
        Result preAll = projectApi.getAllProjects();
        int amountOfProjectsBeforeDelete = preAll.getTotal();
        projectApi.deleteProject(fakeCode);
        Result postAll = projectApi.getAllProjects();
        int amountOfProjectsAfterDelete = postAll.getTotal();
        Assert.assertEquals(amountOfProjectsBeforeDelete,amountOfProjectsAfterDelete+1);
    }
}
