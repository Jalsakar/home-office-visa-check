package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {
    /**
     * nextStepButton, selectJobtypeList locators and create methods 'void selectJobType(String job)'
     * and 'void clickNextStepButton()'
     */
    //========================== Locators ============================//

    //planning to work
    @CacheLookup
    @FindBy(id = "response-0")
    WebElement workTypePlan;
    //Continue button 3
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueBtnOnWorkTypePage;

    //======================== Methods ================================//

    //	Select have planning to work for 'Health and care professional'
    public void selectPlanToWorkForHCP(){
        mouseHoverToElementAndClick(workTypePlan);
    }
    //Click on Continue button 3
    public void mouseHoverAndClickOnContinueBtnOnWorkTypePage() {
        mouseHoverToElementAndClick(continueBtnOnWorkTypePage);
    }


}
