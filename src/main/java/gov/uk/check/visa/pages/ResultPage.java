package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {
    /**
     * resultMessage locator and create methods 'String getResultMessage()'
     * and 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)
     */
    //========================== Locators ============================//

    //Result Message For Australia
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement resultMessageForAustralia;

    //Result Message For HCP
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement resultMessageForHCP;

    //Result Message For Visa Status
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement resultMessageForVisaStatus;

    //======================== Methods ================================//

    //	verify result 'You will not need a visa to come to the UK'
    public String verifyResultMessageForAustralia() {
        return getTextFromElement(resultMessageForAustralia);
    }

    //	verify result 'You need a visa to work in health and care'
    public String verifyResultMessageForHCP() {
        return getTextFromElement(resultMessageForHCP);
    }

    //	verify result 'You’ll need a visa to join your family or partner in the UK'
    public String verifyResultMessageForVisaStatus(){
        return getTextFromElement(resultMessageForVisaStatus);
    }


}
