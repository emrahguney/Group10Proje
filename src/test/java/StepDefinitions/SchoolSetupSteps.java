package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class SchoolSetupSteps {

    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

    @Then("there is already department message should be displayed")
    public void thereIsAlreadyDepartmentMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.already, "already");
    }


    @Then("No result should found")
    public void noResultShouldFound() {
    }

    @And("edit item and click save button")
    public void editItemAndClickSaveButton() {
        dc.clickFunction(dc.editButton);
        dc.sendKeysFunction(dc.nameInput, "math");
        dc.sendKeysFunction(dc.codeInput, "15945");
        dc.clickFunction(dc.saveButton);
    }

    @When("user delete item from school department list")
    public void userDeleteItemFromSchoolDepartmentList() {
        dc.clickFunction(dc.deleteImageBtn);
        dc.clickFunction(dc.deleteDialogBtn);


    }


    @Then("Element should not displayed")
    public void elementShouldNotDisplayed() {
        dc.FoundElement(dc.math);
    }
}
