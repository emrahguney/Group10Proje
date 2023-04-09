package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.WD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AttestationsSteps {

    DialogContent dc = new DialogContent();
    LeftNav lf = new LeftNav();
    WebDriverWait wait =new WebDriverWait(WD.getDriver(), Duration.ofSeconds(5));

    @And("edit item which added in first scenario")
    public void editItemWhichAddedInFirstScenario(DataTable dt) {

    dc.waitUntilRefresh();
    dc.clickFunction(dc.editButton);
    wait.until(ExpectedConditions.visibilityOf(dc.nameInput));
    dc.nameInput.clear();

    List<List<String>> keys = dt.asLists(String.class);

        for (int i = 0; i < keys.size(); i++) {
            WebElement element = dc.getWebElement(keys.get(i).get(0));
            dc.sendKeysFunction(element,keys.get(i).get(1));
        }



    }
}
