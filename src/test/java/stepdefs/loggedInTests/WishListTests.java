package stepdefs.loggedInTests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;
import javax.swing.Action;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.LoggedInPages;


public class WishListTests extends builderClass {
  private static Logger log = LogManager.getLogger(WishListTests.class.getName());
  LoggedInPages lpage = PageFactory.initElements(driver, LoggedInPages.class);
  WebDriverWait wait = new WebDriverWait(driver, 3);
  String input;
  Actions action = new Actions(driver);

  @When("^I click on Your Lists$")
  public void i_click_on_your_lists() throws Throwable
  {
    action.moveToElement(lpage.yourListsDropdownLink).build().perform();
    log.debug("Hovered over Your Lists");
  }

  @And("^I select Wish List$")
  public void i_select_wish_list() throws Throwable
  {
    lpage.waitForFlyout();
    Thread.sleep(1000);
    lpage.wishListLink.click();
  }

  @And("^I add an idea \"([^\"]*)\" to my list$")
  public void i_add_an_idea_to_wish_list(String idea) throws Throwable
  {
    Assert.assertEquals(lpage.yourListsTab.getText() , "Your Lists");
    lpage.addIdeaToListLink.click();
    input = idea + lpage.randomAlphaNumeric(10);
    lpage.ideaInput.sendKeys(input);
    log.debug("Item to add " + input);

  }

  @And("^I click Add to list$")
  public void i_add_to_wish_list() throws Throwable
  {
    lpage.addToListButton.click();
  }

  @And("^My Wish List item is saved$")
  public void wish_list_is_saved() throws Throwable
  {
    Thread.sleep(1000);
    log.debug("The following item was added to the list: "
        + lpage.newWishListItem(input).getText());
  }
}