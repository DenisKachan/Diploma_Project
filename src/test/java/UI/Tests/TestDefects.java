package UI.Tests;

import Utils.RetryAnalyzer;
import Utils.TestConstants;
import org.testng.annotations.Test;

public class TestDefects extends BaseTest implements TestConstants{

    @Test(retryAnalyzer = RetryAnalyzer.class,description = "Test for valid work of test defect creation with valid data")
    public void successfulDefectCreation(){
        defectsSteps.defectCreation(DEFECT_TITLE,DEFECT_ACTUAL_RESULT)
                    .successfulDefectCreationChecking(DEFECT_TITLE);
    }

    @Test(retryAnalyzer = RetryAnalyzer.class,description = "Test for valid work of test defect creation with invalid data")
    public void invalidDefectCreation(){
        defectsSteps.defectCreation("",DEFECT_ACTUAL_RESULT)
                    .invalidDefectCreationChecking();
    }
}
