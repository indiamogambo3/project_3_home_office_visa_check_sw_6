package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;
    @CacheLookup
    @FindBy(id = "response-0")
    WebElement lessThanSixMonths;
    @CacheLookup
    @FindBy(id = "response-1")
    WebElement moreThanSixMonths;

    public void selectLengthOfStay(String moreOrLess) {
        log.info("Selecting length of stay: ");
        switch (moreOrLess) {
            case "6 months or less":
                clickOnElement(lessThanSixMonths);
                break;
            case "longer than 6 months":
                clickOnElement(moreThanSixMonths);
                break;
            default:
                break;
        }
    }

    public void clickOnContinueButton() {
        log.info("Clicking on continue button: " + continueButton.toString());
        clickOnElement(continueButton);
    }

}
