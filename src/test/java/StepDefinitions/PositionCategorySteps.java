package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.List;

public class PositionCategorySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dt) {
        List<String> leftButtons=dt.asList(String.class);

        for (String button : leftButtons){
            WebElement element=ln.getWebElement(button);
            ln.clickFunction(element);
        }
    }

    @And("click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable dt) {
        List<String> dialogButtons=dt.asList(String.class);

        for (String button : dialogButtons){
            WebElement element=dc.getWebElement(button);
            dc.clickFunction(element);
        }
    }

    @And("user sending the key in Dialog Content")
    public void userSendingTheKeyInDialogContent(DataTable dt) {
        List<List<String>> keys=dt.asLists(String.class);

        for (int i = 0; i < keys.size(); i++) {
            WebElement element=dc.getWebElement(keys.get(i).get(0));
            dc.sendKeysFunction(element, keys.get(i).get(1));

        }
    }

    @Then("success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.successMessage, "successfully");
    }

    @And("edit item from Dialog Content")
    public void editItemFromDialogContent() {
        dc.nameInput.clear();
    }

    @And("user delete item from Dialog Content")
    public void userDeleteItemFromDialogContent(DataTable dt) {
        List<String > dialogButtons=dt.asList(String.class);

        for (String deleteButton : dialogButtons){
            dc.deleteItem(deleteButton);
        }

    }
}
