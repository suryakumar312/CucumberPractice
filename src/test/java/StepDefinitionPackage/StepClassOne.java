package StepDefinitionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class StepClassOne {
	WebDriver driver;
	

@Given("lauchbrowser and open the url")
public void lauchbrowser_and_open_the_url() {
	driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
}

@When("locate the seach bar and send inputs")
public void locate_the_seach_bar_and_send_inputs() {
	driver.findElement(By.id("APjFqb")).sendKeys("mobile" + Keys.ENTER);
}

@Then("verify")
public void verify() {
	String title = driver.getTitle();
	System.out.println(title);
}




}
