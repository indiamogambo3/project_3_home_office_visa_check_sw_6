package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement verifyResultTourism;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement verifyResultHealthCare;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You may need a visa')]")
    WebElement verifyResultFamily;

    public String getResultMessageTourism() {
        log.info("Getting result message tourism: " + verifyResultTourism.toString());
        return getTextFromElement(verifyResultTourism);
    }

    public String getResultMessageHealthCare() {
        log.info("Getting result message healthcare: " + verifyResultHealthCare.toString());
        return getTextFromElement(verifyResultHealthCare);
    }

    public String getResultMessageFamily() {
        log.info("Getting result message family: " + verifyResultFamily.toString());
        return getTextFromElement(verifyResultFamily);
    }

}
