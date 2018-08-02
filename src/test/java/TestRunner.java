import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.CucumberFeatureWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import stepdefs.builderClass;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"stepdefs"},
    tags = {"~@Ignore"},
    format = {
        "pretty",
        "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/CucumberTestReport.json",
        "rerun:target/cucumber-reports/rerun.txt"
    })
public class TestRunner extends builderClass {
  private TestNGCucumberRunner testNGCucumberRunner;
  private static Logger log = LogManager.getLogger(builderClass.class.getName());

  @BeforeClass(alwaysRun = true)
  public void setUpClass() throws Exception {
    testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    driver = initDriver();
    driver.get("http://www.amazon.co.uk");
    log.debug("Web Driver set up successfully");
  }

  @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
  public void feature(CucumberFeatureWrapper cucumberFeature) {
    testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
  }

  @DataProvider
  public Object[][] features() {
    return testNGCucumberRunner.provideFeatures();
  }

  @AfterClass(alwaysRun = true)
  public void tearDownClass() throws Exception {
    testNGCucumberRunner.finish();
  }
}