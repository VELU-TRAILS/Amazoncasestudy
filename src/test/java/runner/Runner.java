package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features="Features",glue="maincode",monochrome=true,strict=true)




public class Runner extends AbstractTestNGCucumberTests {



}
