package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {
    /**
     * nextStepButton, yes, no locators and create methods 'void selectImmigrationStatus(String status)'
     * (Note: Use switch statement for select immigration status) and 'void clickNextStepButton()'
     */

    //========================== Locators ============================//

    @CacheLookup
    @FindBy(css = "#response-0")
    WebElement yesRadioBtn;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueBtnForFamilyImmigrationStatusPage;

    //======================== Methods ================================//

    //	Select state My partner of family member have uk immigration status 'yes'
    public void selectStateOfUkImmigrationAsYes(String text){
        mouseHoverToElementAndClick(yesRadioBtn);
    }
    //	Click on Continue button
    public void mouseHoverAndClickOnContinueBtnForFamilyImmigrationStatusPage(){
        mouseHoverToElementAndClick(continueBtnForFamilyImmigrationStatusPage);
    }

}
