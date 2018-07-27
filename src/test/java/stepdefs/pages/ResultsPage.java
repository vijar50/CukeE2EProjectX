package stepdefs.pages;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/*TO-DO List:
1. Update to Page Factory Model
2. Use Explicit Wait conditions on certain the methods
 */
public class ResultsPage {
  private static Logger log = LogManager.getLogger(ResultsPage.class.getName());

  WebDriver driver;

  //Sort Results By
  By sortResults = By.id("sort");

  //Search Result
  By searchResult = By.xpath("//a[@title='PNY GeForce GTX 1080 Ti Custom" +
      " Design']");

  //Star Ratings
  By rating = By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']");
  By fourStar = By.xpath("//*[contains(text(), '4 Stars & Up')]");
  By threeFiveStar = By.xpath("//i[@class='a-icon a-icon-star a-star-3-5']");
  By threeStar = By.xpath("//i[@class='a-icon a-icon-star a-star-3']");

  //Brand
  By brandn = By.name("s-ref-checkbox-ASUS");

  public ResultsPage(WebDriver driver){

    this.driver = driver;
    //Using the wait in the constructor

  }

  public Select resultDropdown(){
    Select dropdown = new Select(driver.findElement(sortResults));
    return dropdown;
  }

  public WebElement searchRes(){
    return driver.findElement(searchResult);
  }

  public List<WebElement> searchResult(){
    List<WebElement> web = driver.findElements(searchResult);
    return web;
  }

  public WebElement starRating(){
    return driver.findElement(rating);
  }

  public void clickFourStars(){
    driver.findElement(fourStar).click();
  }
//
  public List<WebElement> threeFiveStars(){
    List<WebElement> web = driver.findElements(threeFiveStar);
    return web;
  }

  public List<WebElement> threeStars(){
    List<WebElement> web = driver.findElements(threeStar);
    return web;
  }

  public void clickBrand(){
    driver.findElement(brandn).click();
  }

  public void checkResultingBrands(String brand){

    WebDriverWait wait=new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='result_20']/div/div[3]/"
            + "div[2]/span[2]")));
    int i = 0;
    while(!driver.findElements(By.xpath("//*[@id='result_" + i + "']/div/div[3]/"
        + "div[2]/span[2]")).isEmpty()){
      String str = driver.findElement(By.xpath("//*[@id='result_" + i + "']/div/div[3]/"
          + "div[2]/span[2]")).getText();
      Assert.assertEquals(str, brand);
      log.debug("The " + i + " result is ASUS");
      i++;
    }
  }

}
