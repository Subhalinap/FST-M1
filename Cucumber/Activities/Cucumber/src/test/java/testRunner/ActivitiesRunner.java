package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "feature",
        glue = {"stepDefinition"},
        tags = "@activity2_5",
        plugin = { "pretty", "html:target/cucumber-reports/reports.html" },
        monochrome = true
)

public class ActivitiesRunner {
}
