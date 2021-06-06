import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",strict = true,
        dryRun = false, plugin = "json:target/cucumber.json",tags = "@regression"

)

public class Run_Cu_Test
{
}


