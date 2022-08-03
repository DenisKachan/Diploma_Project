package Utils;

import com.github.javafaker.Faker;

public interface TestConstants {
    Faker faker = new Faker();
    String PROJECT_DESCRIPTION = "Test description";
    String TEST_CASE_TITLE = faker.country().name();
    String TEST_CASE_DESCRIPTION = "Test case description";
    String TEST_CASE_PRE_CONDITIONS = "Test case pre-condition";
    String TEST_CASE_POST_CONDITIONS = "Test case post-condition";
    String TEST_CASE_STATUS = "Draft";
    String TEST_CASE_SEVERITY = "Major";
    String TEST_CASE_PRIORITY = "High";
    String TEST_CASE_TYPE = "Functional";
    String TEST_CASE_LAYER = "Unit";
    String TEST_CASE_FLAKY = "No";
    String TEST_CASE_BEHAVIOR = "Positive";
    String TEST_CASE_AUTOMATION_STATUS = "To be automated";
    String TEST_SUITE_NAME = faker.animal().name();
    String TEST_SUITE_DESCRIPTION = "Test suite description";
    String TEST_SUITE_PRECONDITIONS = "Test suite preconditions";
    String TEST_RUN_TITLE = faker.artist().name();
    String DEFECT_TITLE = faker.name().firstName();
    String DEFECT_ACTUAL_RESULT = "Defect result";
}
