package step_definition;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search_steps {
	
	@BeforeAll
	public static void beforeall() {
		System.out.println("before all");
	}
	@AfterAll
	public static void afterall() {
		System.out.println("after all");
	}
	@Before
	public void beforehook() {
		System.out.println("beforehook and browser initialisation ** maximize");
	}
	
	@After
	public void afterhook() {
		System.out.println("afterhook and taking screenshot ** browser closing");
		
	}
	@BeforeStep
	public void beforestephook() {
		System.out.println("step is started");
	}
	@AfterStep
	public void afterstephook() {
		System.out.println("this is after step");
	}
	@Given("navigate the homepage")
	public void navigate_the_homepage() {
	   System.out.println("this is home page"); 
	   System.out.println("navigate to home page, step 1");
	}

	@Then("write {string} in search field")
	public void write_in_search_field(String string) {
	   System.out.println("this is search field, step 2");
	}

	@When("i clicked on search icon")
	public void i_clicked_on_search_icon() {
		System.out.println("search icon step 3");
	    
	}
	@And("waiting for results")
	public void waiting_for_results() {
		System.out.println("result, step 4");
	   
	}

	@Then("the number of resuluts {string}")
	public void the_number_of_resuluts(String string) {
	 System.out.println("number of results, step 5");  
	}



}
