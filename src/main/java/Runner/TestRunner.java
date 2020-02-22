package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "D:\\Cucumber\\BDDFramework\\src\\main\\java\\Features\\login.feature", //the path of the feature files
		glue={"step_def"},
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}//to generate different types of reporting
					
		
	 )


public class TestRunner {

}
