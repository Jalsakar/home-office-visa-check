package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {
    /**
     * nationalityDropDownList, nextStepButton locators and create methods
     * 'void selectNationality(String nationality)' and 'void clickNextStepButton()'
     */
    //========================== Locators ============================//

    //Nationality Drop Down List
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;
    //Continue Button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueBtnOnSelectNationalityPage;


    //======================== Methods ================================//

    //	Select a Nationality 'Australia'
    public void selectANationalityFromDropDownList(String value) {
        selectByContainsTextFromDropDown(nationalityDropDownList, value);
    }
    //	Click on Continue button
    public void mouseHoverAndClickOnContinueBtnOnSelectNationalityPage(){
        mouseHoverToElementAndClick(continueBtnOnSelectNationalityPage);
    }

}
