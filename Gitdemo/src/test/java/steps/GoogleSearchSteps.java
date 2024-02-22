package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//public class GoogleSearchSteps {

//	WebDriver driver = null;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside steps - browser is open");
//		String projPath=System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",projPath+"/src/test/resources/drivers/chromedriver.exe");
//
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("Inside steps -user is on google search page ");
//		driver.navigate().to("https://www.google.com");
//	}
//
//	@When("user enter a test in search box")
//	public void user_enter_a_test_in_search_box() throws InterruptedException {
//		System.out.println("Inside steps -user enter a test in search box ");
//		driver.findElement(By.name("q")).sendKeys("Automation step by step");
//		Thread.sleep(3000);
//
//	}
//
//	@And("click on enter")
//	public void click_on_enter() {
//		System.out.println("Inside steps -click on enter ");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("user navigated to serached results")
//	public void user_navigated_to_serached_results() {
//		System.out.println("Inside steps -user navigated to serached results ");
//		driver.getPageSource().contains("Online Course");
//		driver.close();
//	}
//
//
//
//}
