package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends Utility {
    /**
     * nextStepButton, reasonForVisitList locators and create methods
     * 'void selectReasonForVisit(String reason)' and 'void clickNextStepButton()'
     */

    //========================== Locators ============================//

    //Tourism Radio Btn
    @CacheLookup
    @FindBy(css = "#response-0")
    WebElement tourismRadioBtn;

    //Work Radio Btn
    @CacheLookup
    @FindBy(css = "#response-1")
    WebElement workRadioBtn;

    //Continue button 1
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueBtn1;

    //Family And Partner Radio Button
    @CacheLookup
    @FindBy(css = "#response-4")
    WebElement familyAndPartnerRadioBtn;

    //======================== Methods ================================//

    //	Select reason 'Tourism'
    public void selectRadioBtnForReasonTourism(String value) {
        mouseHoverToElementAndClick(tourismRadioBtn);
    }
    //	Select reason 'Work'
    public void selectRadioBtnForReasonWork(String value) {
        mouseHoverToElementAndClick(workRadioBtn);
    }

    //	Click on Continue button 1
    public void mouseHoverAndClickOnContinueOfReasonForTravelPage() {
        mouseHoverToElementAndClick(continueBtn1);
    }

    //	Select reason 'Join partner or family for a long stay'
    public void selectRadioBtnForJoinPartnerOrFamilyForALongStay(String value){
        mouseHoverToElementAndClick(familyAndPartnerRadioBtn);
    }

}
