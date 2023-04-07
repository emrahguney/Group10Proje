package Pages;

import Utilities.WD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(WD.getDriver(),this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;
    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "(//ms-delete-button/button)[1]")
    private WebElement deleteImageBtn;
    @FindBy(xpath="//button[@type='submit']")
    private WebElement deleteDialogBtn;


    public void deleteItem(String searchText){

        sendKeysFunction(searchInput,searchText);
        clickFunction(searchButton);


        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));

        clickFunction(deleteImageBtn);
        clickFunction(deleteDialogBtn);


    }


    public WebElement getWebElement(String Button) {

        switch (Button) {

            default: return null;
        }

    }
}
