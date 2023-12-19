package StepDefinitionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class StepFiveClass {
	WebDriver driver;

@Given("open a browser and launch facebook url")
public void open_a_browser_and_launch_facebook_url() {
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
}



@When("locating username and password and sending surya and qwerty12270 inputs")
public void locating_username_and_password_and_sending_surya_and_qwerty12270_inputs() {
	driver.findElement(By.id("email")).sendKeys();
	driver.findElement(By.id("pass")).sendKeys();
}

@When("click login button")
public void click_login_button() {
	driver.findElement(By.name("login")).click();
}

@When("locating username and password and sending sharan and qwerty8881 inputs")
public void locating_username_and_password_and_sending_sharan_and_qwerty8881_inputs() {
	driver.findElement(By.id("email")).sendKeys();
	driver.findElement(By.id("pass")).sendKeys();
}

@When("locating username and password and sending kathir and asdfg4080 inputs")
public void locating_username_and_password_and_sending_kathir_and_asdfg4080_inputs() {
	driver.findElement(By.id("email")).sendKeys();
	driver.findElement(By.id("pass")).sendKeys();
}

@When("locating username and password and sending aswin and zxcvb06111 inputs")
public void locating_username_and_password_and_sending_aswin_and_zxcvb06111_inputs() {
	driver.findElement(By.id("email")).sendKeys();
	driver.findElement(By.id("pass")).sendKeys();
}



}
