package StepDefinitionPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepFourClass {
	
	

@Given("launch broser and load url")
public void launch_broser_and_load_url() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
}

@When("locate searchbar and send input as cars and press enter")
public void locate_searchbar_and_send_input_as_cars_and_press_enter() {
}

@Then("validate the input.")
public void validate_the_input() {
}

@When("locate searchbar and send input as bike and press enter")
public void locate_searchbar_and_send_input_as_bike_and_press_enter() {
}

@When("locate searchbar and send input as mobile and press enter")
public void locate_searchbar_and_send_input_as_mobile_and_press_enter() {
}



}