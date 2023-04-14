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

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//ms-edit-button//span[@class='mat-button-wrapper']")
    public WebElement editButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortNameInput;

    @FindBy(xpath="//div[contains(text(),'exists')]")
    public WebElement alreadyExists;

    @FindBy(xpath = "//div[contains(text(),'no data to display')]")
    public WebElement noDataToDisplay;



    public void deleteItem(String searchText){

        sendKeysFunction(searchInput,searchText);
        clickFunction(searchButton);


        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));

        clickFunction(deleteImageBtn);
        clickFunction(deleteDialogBtn);


    }


    public WebElement getWebElement(String Button) {

        switch (Button) {
            case "addButton" : return addButton;
            case "nameInput" : return nameInput;
            case "saveButton": return saveButton;
            case "editButton": return editButton;
            case "searchInput": return searchInput;
            case "shortName":return shortNameInput;


            default: return null;
        }

    }

    public void waitUntilRefresh(){

        wait.until(ExpectedConditions.numberOfElementsToBe
                (By.xpath("//fuse-progress-bar/*") , 0));

    }


    public void clickOnSearchButton(){

        searchButton.click();
    }

}
