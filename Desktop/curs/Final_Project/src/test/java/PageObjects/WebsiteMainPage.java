package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebsiteMainPage {

    @FindBy (xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement enrollmentButton;

    @FindBy ( xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement readMoreButton;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement virtualHeader;

    @FindBy ( xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailBox;

    @FindBy ( xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    @FindBy ( xpath = "//*[@id=\"instructors\"]/div/div/div[3]/div/div/a[1]/i")
    private WebElement scrollToInstructors;

    @FindBy ( xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[1]/i")
    private WebElement twitterButton;

    @FindBy ( xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement scrollToFirstAccordion;

    @FindBy ( xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement firstAccordion;

    @FindBy ( xpath = "/html/body/footer/div/p")
    private WebElement scrollToTheBottom;

    @FindBy ( xpath = "/html/body/footer/div/a/i")
    private WebElement toTopButton;

    @FindBy ( xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement invalidEmailBox;

    @FindBy ( xpath = "/html/body/section[3]/div/div/div[1]/div/div")
    private WebElement scrollToVirtualBox;

    @FindBy ( xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtualReadMoreButton;

    @FindBy ( xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNameBox;

    @FindBy ( xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameBox;

    @FindBy ( xpath = "//*[@id=\"username\"]")
    private WebElement usernameBox;

    @FindBy ( xpath = "//*[@id=\"password\"]")
    private WebElement passwordBox;

    @FindBy ( xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPasswordBox;

    @FindBy ( xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;


    public WebsiteMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnEnrollmentButton() {this.enrollmentButton.click();}

    public void clickOnReadMoreButton() {this.readMoreButton.click();}

    public WebElement getVirtualHeaderElement() { return this.virtualHeader;}

    public void clickOnSubmitButton() { this.submitButton.click();}

    public WebElement getScrollToInstructors() { return this.scrollToInstructors;}

    public void clickOnTwitterButton() { this.twitterButton.click();}

    public WebElement getScrollToFirstAccordion() { return this.scrollToFirstAccordion;}

    public void clickOnFirstAccordion() { this.firstAccordion.click();}

    public WebElement getScrollToTheBottom() { return this.scrollToTheBottom;}

    public void clickToTheTopButton() { this.toTopButton.click();}

    public WebElement getScrollToVirtualBox() { return this.scrollToVirtualBox;}

    public void clickVirtualReadMoreButton() { this.virtualReadMoreButton.click();}

    public void clickOnNextButton() { this.nextButton.click();}

    public void inputSignUpData(String name) {
        this.firstNameBox.sendKeys(name);
        this.lastNameBox.sendKeys(name);
    }


    public void inputEmail(String email) {
        this.emailBox.sendKeys(email);
        this.clickOnSubmitButton();
    }

    public void inputInvalidEmail(String invalidEmail) {
        this.invalidEmailBox.sendKeys(invalidEmail);
        this.clickOnSubmitButton();
    }
}
