package API.BaseAPI;

import UI.Utils.PropertyReader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseApi {
    protected PropertyReader propertyReader = new PropertyReader();
    protected String baseUrl = propertyReader.getProperty("baseAPIUrl");
    public Gson gson = new GsonBuilder().
            excludeFieldsWithoutExposeAnnotation().
            create();
    RequestSpecification requestSpecification;

    public BaseApi() {
        requestSpecification =
                given().
                        header("Content-Type", "application/json").
                        header("Token", propertyReader.getProperty("token")).
                        log().all();
    }

    @Step("Sending post request with {body} as a body and {uri} as an uri")
    protected Response post(String body, String uri) {
        return requestSpecification.
                body(body).
                when().
                log().all().
                post(baseUrl + uri).
                then().
                statusCode(200).
                log().all().
                extract().response();
    }

    @Step("Sending get request to a {uri} uri")
    protected Response get(String uri) {
        return requestSpecification.
                when().
                get(baseUrl + uri).
                then().
                log().all().
                statusCode(200).
                extract().response();
    }

    @Step("Sending delete request to a {uri} uri")
    protected Response delete(String uri) {
        return requestSpecification.
                when().
                delete(baseUrl + uri).
                then().
                log().all().
                statusCode(200).
                extract().response();
    }

    @Step("Sending patch request with {body} as a body and {uri} as an uri")
    protected Response patch(String body, String uri) {
        return requestSpecification.
                body(body).
                when().
                log().all().
                patch(baseUrl + uri).
                then().
                statusCode(200).
                log().all().
                extract().response();
    }
}
