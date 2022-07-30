package org.example;

import PageObjects.WebsiteMainPage;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.helpers.Util;

import java.util.Locale;

public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();

    private WebsiteMainPage mainPage;

    public StepDefinitions() {
        driver.manage().window().maximize();
        mainPage = new WebsiteMainPage(driver);
    }

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get("file:///C:/Users/Alex/Desktop/curs/Testing-Env-master/index.html");
    }

    @When("I press Start enrollment button")
    public void i_press_start_enrollment_button() {
        mainPage.clickOnEnrollmentButton();
    }

    @Then("it start the enrollment")
    public void it_start_the_enrollment() {}

    @When("I press read more button")
    public void i_press_read_more_button() {
        Utils.scrollToElement(driver, mainPage.getVirtualHeaderElement());
        mainPage.clickOnReadMoreButton();
    }

    @Then("it takes me to read more page")
    public void it_takes_me_to_read_more_page() {}

    public StepDefinitions(WebDriver driver) {
        mainPage = new WebsiteMainPage(driver);
        PageFactory.initElements(driver, this);
    }

    @When("I introduce {string}")
    public void i_introduce_a_valid_email(String string) {
        mainPage.inputEmail(string);
    }

    @Then("a pop-up confirm the subscription")
    public void a_pop_up_confirm_the_subscription() {
    }

    @Given("I am on the instructor section")
    public void i_am_on_the_instructor_section() {
        driver.get("file:///C:/Users/Alex/Desktop/curs/Testing-Env-master/index.html");
        Utils.scrollToElement(driver, mainPage.getScrollToInstructors());
    }
    @When("I press twitter button")
    public void i_press_facebook_button() {
        mainPage.clickOnTwitterButton();
    }
    @Then("It takes me to the Twitter page")
    public void it_takes_me_to_the_twitter_page() {
    }

    @Given("I am on the FAQ section")
    public void i_am_on_the_faq_section() {
        driver.get("file:///C:/Users/Alex/Desktop/curs/Testing-Env-master/index.html");
        Utils.scrollToElement(driver, mainPage.getScrollToFirstAccordion());
    }
    @When("I press on first accordion")
    public void i_press_on_first_accordion() {
        mainPage.clickOnFirstAccordion();
    }

    @Then("It have to collapse")
    public void it_have_to_collapse() {
    }

    @Given("I am on the bottom of the main page")
    public void i_am_on_the_bottom_of_the_main_page() {
        driver.get("file:///C:/Users/Alex/Desktop/curs/Testing-Env-master/index.html");
        Utils.scrollToElement(driver, mainPage.getScrollToTheBottom());
    }
    @When("I press the arrow from lower corner")
    public void i_press_the_arrow_from_lower_corner() {
        mainPage.clickToTheTopButton();
    }
    @Then("It have to scroll up to the main page")
    public void it_have_to_scroll_up_to_the_main_page() {
    }

    @Then("the email box should be red")
    public void the_email_box_should_be_red() {
        driver.findElement(By.cssSelector(".error"));
    }

    @When("I press read more button from virtual section")
    public void i_press_read_more_button_from_virtual_section() {
        Utils.scrollToElement(driver, mainPage.getScrollToVirtualBox());
        mainPage.clickVirtualReadMoreButton();
    }
    @Then("the page title should start with {string}")
    public void the_page_title_should_start_with(String string) {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith(string));
    }

    @Given("I am on the sign up page")
    public void i_am_on_the_sign_up_page() {
        driver.get("file:///C:/Users/Alex/Desktop/Testing%20Env/Testing-Env/routes/enrollment.html");
    }
    @When("I introduce the required data")
    public void i_introduce_the_required_data() {
        driver.findElement(By.id("firstName")).sendKeys("Test");
        driver.findElement(By.id("lastName")).sendKeys("Test");
        driver.findElement(By.id("username")).sendKeys("testing");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("cpassword")).sendKeys("password");

    }
    @When("I press next button")
    public void i_press_next_button() {
        mainPage.clickOnNextButton();
        driver.findElement(By.id("email")).sendKeys("testing@test.com");
        driver.findElement(By.id("phone")).sendKeys("0770123123");
        driver.findElement(By.id("country")).sendKeys("Romania");
        driver.findElement(By.id("city")).sendKeys("Brasov");
        driver.findElement(By.id("postCode")).sendKeys("123123");
    }
    @Then("a new page will open")
    public void a_new_page_will_open() {
    }

    @After
    public void closeBrowser(Scenario scenario) {
        driver.quit();
    }

}
