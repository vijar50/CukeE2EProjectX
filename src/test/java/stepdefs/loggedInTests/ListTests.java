package stepdefs.loggedInTests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.LoggedInPages;


public class ListTests extends builderClass {
  private static Logger log = LogManager.getLogger(ListTests.class.getName());
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
    lpage.waitforTextPresent(input, lpage.listItem);
  }

  @And("^My Wish List item is saved$")
  public void wish_list_is_saved() throws Throwable
  {
    log.debug("The following item was added to the list: "
        + lpage.newWishListItem(input).getText());
  }

  @And("^I click Create a List$")
  public void create_a_list() throws Throwable
  {
    lpage.createListLink.click();
  }

  @And("^I set a List name of \"([^\"]*)\"$")
  public void set_list_name(String listName) throws Throwable
  {
    //lpage.waitforElementPresent(lpage.popUpWindow);
    input = "";
    input = listName + lpage.randomAlphaNumeric(5);
    lpage.newListNameInput.sendKeys(input);
  }

  @Then("^I delete the latest item$")
  public void delete_item() throws Throwable
  {
    lpage.checkAndRemoveItem();
    lpage.waitforTextPresent("Deleted", lpage.deletedStatusMessage);
    log.debug("The item has been: " + lpage.deletedStatusMessage.getText());
  }

  @Then("^I Create the List$")
  public void shopping_list_is_created() throws Throwable
  {
    lpage.createListButton.click();
    Thread.sleep(2000);
  }
}