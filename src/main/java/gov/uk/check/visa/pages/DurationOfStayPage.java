package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {
    /**
     * nextStepButton, lessThanSixMonths, moreThanSixMonths locators and create methods
     * 'void selectLengthOfStay(String moreOrLess)'
     * (Note: use switch statement for select moreOrLess stay)
     * and 'void clickNextStepButton()'
     */

    //========================== Locators ============================//

    //stay for 'longer than 6 months'
    @CacheLookup
    @FindBy(id = "response-1")
    WebElement stayForLongerThanSixMonth;

    //Stay for long with Partner or Family
    @CacheLookup
    @FindBy(css = "#response-4")
    WebElement stayForLongStay;


    //Continue button 2
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueBtnOnDurationOfStayPage;

    //======================== Methods ================================//

    //	Click on Continue button on Duration Of Stay Page
    public void clickOnContinueButtonForDurationOfLongStayPage() {
        mouseHoverToElementAndClick(continueBtnOnDurationOfStayPage);
    }

    //	Select intended to stay for 'longer than 6 months'
    public void selectRadioBtnToStayForLongerThanSixMonth() {
        mouseHoverToElementAndClick(stayForLongerThanSixMonth);
    }


    //	Select reason 'Join partner or family for a long stay'
    public void selectReasonJoinPartnerOrFamilyForLongStay() {
        mouseHoverToElementAndClick(stayForLongStay);
    }


}
