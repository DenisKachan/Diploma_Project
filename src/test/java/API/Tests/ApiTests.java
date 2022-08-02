package API.Tests;

import API.dto.defects.Defect;
import API.dto.projects.Project;
import UI.Utils.TestConstants;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTests extends BaseApiTest implements TestConstants {
    Faker faker = new Faker();
    String fakeCode = faker.code().ean8();

    @Test(priority = 1, description = "Creation of a new project using post request")
    public void createProject() {
        Project project = new Project();
        project.setCode(fakeCode);
        project.setTitle("TestTitle");
        projectApi.createNewProject(project);
        Assert.assertEquals(project.getCode(), fakeCode);
    }

    @Test(priority = 2, description = "Getting project by code using get request")
    public void getProjectByCode(){
        Project actual = projectApi.getProjectByCode(fakeCode);
        Assert.assertEquals(actual.getCode(),fakeCode);
    }

    @Test(priority = 3, description = "Delete project with the established code using delete request")
    public void deleteProject(){
        projectApi.deleteProject(fakeCode);
    }

    @Test(description = "Creation of a new defect using post request")
    public void createDefect() {
        Defect defect = new Defect();
        defect.setTitle(DEFECT_TITLE);
        defect.setActual_result("actual");
        defect.setSeverity(1);
        defectApi.createNewDefect(defect);
        Assert.assertEquals(defect.getTitle(),DEFECT_TITLE);
    }

    @Test(description = "Patching of a defect using patch request")
    public void patchDefect() {
        Defect defect = new Defect();
        defect.setTitle("dsdvsvfv");
        defectApi.patchDefect(defect);
        Assert.assertEquals(defect.getTitle(),"dsdvsvfv");
    }

}
