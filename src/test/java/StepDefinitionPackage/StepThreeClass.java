package StepDefinitionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepThreeClass {
	WebDriver driver;
	
	@Before 
public void testing() {

	System.out.println("before hooks test.....");
}

@Given("launch browser and load fb url")
public void launch_browser_and_load_fb_url() {
	driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	
}

@When("provide surya and qwerty123 and click login")
public void provide_surya_and_qwerty123_and_click_login() {
	driver.findElement(By.id("email")).sendKeys("surya ");
	driver.findElement(By.id("pass")).sendKeys("qwerty123");
	driver.findElement(By.name("login")).click();
	
}

@Then("verify the inputs")
public void verify_the_inputs() {
}

@When("provide sharan and asdfg123 and click login")
public void provide_sharan_and_asdfg123_and_click_login() {
}

@When("provide aswin and zxcvb123 and click login")
public void provide_aswin_and_zxcvb123_and_click_login() {
}

@When("provide kathir and lkjh123 and click login")
public void provide_kathir_and_lkjh123_and_click_login() {
}



}
