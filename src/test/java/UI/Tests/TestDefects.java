package UI.Tests;

import UI.Utils.TestConstants;
import org.testng.annotations.Test;

public class TestDefects extends BaseTest implements TestConstants{
    @Test
    public void successfulDefectCreation(){
        defectsSteps.defectCreation(DEFECT_TITLE,DEFECT_ACTUAL_RESULT);
        defectsSteps.successfulDefectCreationChecking(DEFECT_TITLE);
    }

    @Test
    public void invalidDefectCreation(){
        defectsSteps.defectCreation("",DEFECT_ACTUAL_RESULT);
        defectsSteps.invalidDefectCreationChecking();
    }
}
