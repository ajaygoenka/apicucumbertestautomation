import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/cucumber",
        glue="com.automation.test.api.step_definitions",
        tags = {"@mul", "not @4"},
        plugin = {"pretty", "html:target/cucumber"})
public class CucumberRunner {
}
