package UI.Tests;

import org.testng.annotations.Test;

public class TestDefects extends BaseTest{
    @Test
    public void successfulDefectCreation(){
        defectsSteps.successfulDefectCreation();
    }

    @Test
    public void invalidDefectCreation(){
        defectsSteps.invalidDefectCreation();
    }
}
