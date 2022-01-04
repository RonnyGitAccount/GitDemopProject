package MyRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\java\\Features",
        glue = {"StepDefinition"},
        format = {"pretty", "html:target/Destination"}
        )


public class TestRunner {
}
