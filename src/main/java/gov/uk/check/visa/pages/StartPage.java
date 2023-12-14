package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Utility {
    /**
     * startNowButton locators and create method 'void clickStartNow()'
     */
//========================== Locators ============================//
    //Accept Cookies Btn
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptCookiesBtn;

    //StartNow Btn
    @CacheLookup
    @FindBy(css = ".gem-c-button.govuk-button.govuk-button--start")
    WebElement startNowBtn;

//======================== Methods ================================//

    //Click on Accept Cookies Button
    public void mouseHoverAndClickOnAcceptCookiesBtn() {
        mouseHoverToElementAndClick(acceptCookiesBtn);
    }

    //  Click on start button
    public void mouseHoverAndClickOnStartBtn() {
        mouseHoverToElementAndClick(startNowBtn);
    }

}
