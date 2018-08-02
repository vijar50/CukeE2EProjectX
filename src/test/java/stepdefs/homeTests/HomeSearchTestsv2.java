package stepdefs.homeTests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.HomePagev2;


public class HomeSearchTestsv2 extends builderClass {
  private static Logger log = LogManager.getLogger(HomeSearchTestsv2.class.getName());
  HomePagev2 hpage = PageFactory.initElements(driver, HomePagev2.class);
  WebDriverWait wait = new WebDriverWait(driver, 3);


}