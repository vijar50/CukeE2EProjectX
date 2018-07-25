package stepdefs.homeTests;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.HomePage;


//USING POM and LOGGING
public class HomeDeptTests extends builderClass {
  private static Logger log = LogManager.getLogger(HomeDeptTests.class.getName());
  HomePage home;

  @When("^I shop by Department I choose \"([^\"]*)\" and \"([^\"]*)\"$")
  public void i_shop_by(String cat2, String cat3) throws Throwable
  {
    home = new HomePage(driver);
    //Add a wait condition for the dropdown element
    WebDriverWait wait = new WebDriverWait(driver, 3);
    Actions action = new Actions(driver);

    action.moveToElement(home.selectFirstCat()).build().perform();
    log.debug("First Cat: " + home.selectFirstCat().getText());

    //Explicit wait example
    WebElement flink = wait.until(ExpectedConditions.visibilityOfElementLocated(home.deptFlyoutLink()));
    log.debug("The Flyout is Displayed? "+ flink.isDisplayed());
    //Move to and assert the Categories
    action.moveToElement(home.selectSecondCat()).build().perform();
    Assert.assertEquals(home.selectSecondCat().getText() , cat2);
    log.debug("Second Cat: " + home.selectSecondCat().getText());

    Assert.assertEquals(home.selectThirdCat().getText() , cat3);
    home.selectThirdCat().click();
    log.debug("Third Cat: " + home.selectThirdCat().getText());
  }

  @Then("^I am on the \"([^\"]*)\" page$")
  public void product_landing_page(String title) throws Throwable
  {
    home = new HomePage(driver);
    Assert.assertEquals(home.getTitle(), title);
    log.debug("This is the string: " + home.getTitle());
  }

}