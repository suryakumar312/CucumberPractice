package StepDefinitionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class StepTwoClass {
	WebDriver driver;


@Given("launch url and browser")
public void launch_url_and_browser() {
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
}

@When("send inputs as {string} and press enter")
public void send_inputs_as_and_press_enter(String x) {
	driver.findElement(By.id("APjFqb")).sendKeys(x +Keys.ENTER);
}

	
}