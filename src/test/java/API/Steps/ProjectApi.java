package API.Steps;

import API.BaseAPI.BaseApi;
import API.dto.projects.Project;
import API.dto.projects.Result;
import io.qameta.allure.Step;

public class ProjectApi extends BaseApi {

    @Step("Creation of a new {project} project")
    public void createNewProject(Project project) {
        post(gson.toJson(project), "project");
    }

    @Step("Getting project by {code} as a code")
    public Project getProjectByCode(String code) {
        return gson.fromJson(get("project/" + code).path("result").toString(), Project.class);
    }

    @Step("Getting all projects")
    public Result getAllProjects() {
        return gson.fromJson(get("project").path("result").toString(), Result.class);
    }

    @Step("Delete project by {code} as a code")
    public void deleteProject(String code) {
        delete("project/" + code);
    }
}
