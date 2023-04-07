package StepDefinitions;
import Utilities.WD;
import io.cucumber.java.After;


public class Hooks {
    @After
    public void after(){
        WD.quitDriver();
    }
}
