package API.Steps;

import API.BaseAPI.BaseApi;
import API.dto.defects.Defect;
import io.qameta.allure.Step;

public class DefectApi extends BaseApi {

    @Step("Creation of a new {defect} defect")
    public void createNewDefect(Defect defect){
        post(gson.toJson(defect), propertyReader.getProperty("defectAPIuri"));
    }

    @Step("Patching of a {defect} defect")
    public void patchDefect(Defect defect){
        patch(gson.toJson(defect), propertyReader.getProperty("defectAPIuri") + "/1");
    }

}
