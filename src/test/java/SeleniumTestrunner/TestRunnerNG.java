package SeleniumTestrunner;

public class TestRunnerNG {
	// features folder and stepdef can communicate through TestRunner   
		@CucumberOptions(   
		features = {"Features"},     
		glue = {"name.stepdefs"}  
		) 
		public class TestRunner extends AbstractTestNGCucumberTests{}
	
}