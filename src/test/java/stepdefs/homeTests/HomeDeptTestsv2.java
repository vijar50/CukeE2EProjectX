package stepdefs.homeTests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.HomePagev2;


public class HomeDeptTestsv2 extends builderClass {
  private static Logger log = LogManager.getLogger(HomeDeptTestsv2.class.getName());
  HomePagev2 hpage = PageFactory.initElements(driver, HomePagev2.class);
  WebDriverWait wait = new WebDriverWait(driver, 3);

  @When("^I shop by Department I choose \"([^\"]*)\" and \"([^\"]*)\"$")
  public void i_shop_by(String cat2, String cat3) throws Throwable
  {
    //Add a wait condition for the dropdown element
    Actions action = new Actions(driver);

    action.moveToElement(hpage.deptcat1).build().perform();
    log.debug("Link Name: " + hpage.deptcat1.getText());
    //Wait for Menu to load
    hpage.waitForFlyout();

    //Move to and assert the Categories
    action.moveToElement(hpage.deptcat2).build().perform();

    try {
      Assert.assertEquals(hpage.deptcat2.getText(), cat2);
    }catch (Exception e){
      log.debug("Second Cat: " + hpage.deptcat2.getText());
    }

    try {
      Assert.assertEquals(hpage.deptcat3.getText(), cat3);
      hpage.deptcat3.click();
    }catch (Exception e){
      log.debug("Third Cat: " + hpage.deptcat3.getText());
    }

  }

  @Then("^I am on the \"([^\"]*)\" page$")
  public void product_landing_page(String title) throws Throwable
  {
    Assert.assertEquals(hpage.title.getText(), title);
    log.debug("This is the header: " + hpage.title.getText());
  }
}