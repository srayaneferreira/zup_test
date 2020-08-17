package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",	// Path: features = "classpath:features"
		glue = "steps",					// Path: Steps
		monochrome = true,							// Cores no Terminal default: false
		strict = true,								// Considerar steps indefinidos erros ou nao, default: false
		dryRun = false,								// Validar Steps sem executar o teste
		
		plugin = {		// Plugins do Cucumber
			"pretty",
			"html:target/cucumber-reports/reports-html",
			"json:target/cucumber-reports/report.json",
			"junit:target/cucumber-reports/report.xml"
		},
		
		tags = {		// tags = "@TagQueSeraExecutada" ou {"~@ignore"}
			"@ProdutoSariva"
		}
)

public class RunnerTest {

}
