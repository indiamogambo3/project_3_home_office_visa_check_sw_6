package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaRequirementCheckSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }


    @When("I click on accept cookies")
    public void iClickOnAcceptCookies() {
        new StartPage().acceptAllCookies();
    }

    @And("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickOnStartNowButton();
    }

    @And("I select nationality {string}")
    public void iSelectNationality(String nationality) {
        new SelectNationalityPage().selectNationalityFromDropDown(nationality);
    }

    @And("I click on continue button in nationality page")
    public void iClickOnContinueButtonInNationalityPage() {
        new SelectNationalityPage().clickOnContinueButton();
    }

    @And("I select reason {string}")
    public void iSelectReason(String reason) {
        new ReasonForTravelPage().selectReasonForVisit(reason);
    }

    @And("I Click on continue button in reason for travel page")
    public void iClickOnContinueButtonInReasonForTravelPage() {
        new ReasonForTravelPage().clickOnContinueButton();
    }

    @Then("You will not need a visa to come to the UK message is displayed")
    public void youWillNotNeedAVisaToComeToTheUKMessageIsDisplayed() {
        Assert.assertEquals(new ResultPage().getResultMessageTourism(), "You will not need a visa to come to the UK", "Unable to verify message");
    }

    @And("I select intend to stay for {string}")
    public void iSelectIntendToStayFor(String moreOrLess) {
        new DurationOfStayPage().selectLengthOfStay(moreOrLess);
    }

    @And("I click on continue button in duration of stay page")
    public void iClickOnContinueButtonInDurationOfStayPage() {
        new DurationOfStayPage().clickOnContinueButton();
    }

    @And("I select have planning to work for {string}")
    public void iSelectHavePlanningToWorkFor(String job) {
        new WorkTypePage().selectJobTypes(job);
    }

    @And("I click on continue button in work type page")
    public void iClickOnContinueButtonInWorkTypePage() {
        new WorkTypePage().clickOnContinueButton();
    }

    @Then("You need a visa to work in health and care message is displayed")
    public void youNeedAVisaToWorkInHealthAndCareMessageIsDisplayed() {
        Assert.assertEquals(new ResultPage().getResultMessageHealthCare(), "You need a visa to work in health and care", "Unable to verify message");
    }

    @Then("You’ll need a visa to join your family or partner in the UK message is displayed")
    public void youLlNeedAVisaToJoinYourFamilyOrPartnerInTheUKMessageIsDisplayed() {
        Assert.assertEquals(new ResultPage().getResultMessageFamily(), "You may need a visa", "Unable to verify message");
    }

}
