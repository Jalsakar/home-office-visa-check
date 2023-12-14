package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class VisaConfirmationTest extends BaseTest {
    DurationOfStayPage durationOfStayPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    SelectNationalityPage selectNationalityPage;
    StartPage startPage;
    WorkTypePage workTypePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        durationOfStayPage = new DurationOfStayPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        selectNationalityPage = new SelectNationalityPage();
        startPage = new StartPage();
        workTypePage = new WorkTypePage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    //1.anAustralianComInToUKForTourism().
    public void anAustralianComInToUKForTourism() {

        //Click on Accept Cookies Button
        startPage.mouseHoverAndClickOnAcceptCookiesBtn();

        //Click on start button
        startPage.mouseHoverAndClickOnStartBtn();

        //Select a Nationality 'Australia'
        selectNationalityPage.selectANationalityFromDropDownList("Australia");

        //Click on Continue button
        selectNationalityPage.mouseHoverAndClickOnContinueBtnOnSelectNationalityPage();

        //Select reason 'Tourism'
        reasonForTravelPage.selectRadioBtnForReasonTourism("Tourism");

        //Click on Continue button
        reasonForTravelPage.mouseHoverAndClickOnContinueOfReasonForTravelPage();

        //verify result 'You will not need a visa to come to the UK'
        Assert.assertEquals(resultPage.verifyResultMessageForAustralia(), "You will not need a visa to come to the UK", "Error Message");


    }

    @Test(groups = {"smoke", "regression"})
    //2.aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths().
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {

        //Click on Accept Cookies Button
        startPage.mouseHoverAndClickOnAcceptCookiesBtn();

        //	Click on start button
        startPage.mouseHoverAndClickOnStartBtn();

        //	Select a Nationality 'Chile'
        selectNationalityPage.selectANationalityFromDropDownList("Chile");

        //	Click on Continue button
        selectNationalityPage.mouseHoverAndClickOnContinueBtnOnSelectNationalityPage();

        //	Select reason 'Work, academic visit or business'
        reasonForTravelPage.selectRadioBtnForReasonWork("Work, academic visit or business");

        //	Click on Continue button
        reasonForTravelPage.mouseHoverAndClickOnContinueOfReasonForTravelPage();

        //	Select intended to stay for 'longer than 6 months'
        durationOfStayPage.selectRadioBtnToStayForLongerThanSixMonth();

        //	Click on Continue button
        durationOfStayPage.clickOnContinueButtonForDurationOfLongStayPage();

        //	Select have planning to work for 'Health and care professional'
        workTypePage.selectPlanToWorkForHCP();

        //	Click on Continue button
        workTypePage.mouseHoverAndClickOnContinueBtnOnWorkTypePage();

        //	verify result 'You need a visa to work in health and care'
        Assert.assertEquals(resultPage.verifyResultMessageForHCP(), "You need a visa to work in health and care", "Error Message");

    }

    @Test(groups = {"sanity", "smoke", "regression"})
    //3.aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card().
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() {

        //Click on Accept Cookies Button
        startPage.mouseHoverAndClickOnAcceptCookiesBtn();

        //	Click on start button
        startPage.mouseHoverAndClickOnStartBtn();

        //	Select a Nationality 'Colombia'
        selectNationalityPage.selectANationalityFromDropDownList("India");

        //	Click on Continue button
        selectNationalityPage.mouseHoverAndClickOnContinueBtnOnSelectNationalityPage();

        //	Select reason 'Join partner or family for a long stay'
        reasonForTravelPage.selectRadioBtnForJoinPartnerOrFamilyForALongStay("Join partner or family for a long stay");

        //	Click on Continue button
        reasonForTravelPage.mouseHoverAndClickOnContinueOfReasonForTravelPage();

        //	Select state My partner of family member have uk immigration status 'yes'
        familyImmigrationStatusPage.selectStateOfUkImmigrationAsYes("Yes");

        //	Click on Continue button
        familyImmigrationStatusPage.mouseHoverAndClickOnContinueBtnForFamilyImmigrationStatusPage();

        //	verify result 'You’ll need a visa to join your family or partner in the UK'
        Assert.assertEquals(resultPage.verifyResultMessageForVisaStatus(), "You’ll need a visa to join your family or partner in the UK","Error Message");

    }
}
