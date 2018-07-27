package stepdefs.pages;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TodayDealsPage {
  private static Logger log = LogManager.getLogger(TodayDealsPage.class.getName());

  WebDriver driver;
  WebDriverWait wait;

  //Today Deals Link
  @FindBy(how = How.XPATH, using = "//div[@id='nav-xshop']/a[2]")
  public WebElement todayDeals;

  //Today Deals Page Headers
  @FindBy(how = How.XPATH, using = "//div[contains(text(),'Today')]")
  public WebElement pageHeader;

  //A Deal - Is not a View or See Options or a Deal has ended or Learn More
  @FindBy(how = How.CSS, using = "#a-autoid-1-announce")
  public WebElement deal;

  //Cart Count
  @FindBy(how = How.ID, using = "nav-cart-count")
  public WebElement cartcount;

  //Price Range


  //Quantity in Checkout
  @FindBy(how = How.CSS, using = ".a-dropdown-prompt")
  public WebElement qty;


  public TodayDealsPage(WebDriver driver){

    this.driver = driver;
    //Using the wait in the constructor
    wait=new WebDriverWait(driver, 5);

  }

}
  /*public String getTodayDealsPageHeader(){
    return driver.findElement(pageHeader).getText();
  }*/
 /* public List<String> getTodayDealsHeaders(){
    //Example of when there are multiple headers, putting in an arrau

    List<String> headerList= new ArrayList<String>();

    for (WebElement webele : pageHeader){
      headerList.add(webele.getText());

    }
    return headerList;
  }*/