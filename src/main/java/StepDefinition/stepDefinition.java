package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefinition {
    WebDriver driver;

    @Given("^User id on Home Page$")
    public void user_id_on_Home_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //https://www.youtube.com/watch?v=vHzMJuc9Zuk
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.navigate().to("http://automationpractice.com/index.php");
            driver.manage().window().maximize();
    }

    @When("^User Clicks on Contact Us$")
    public void user_Clicks_on_Contact_Us() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("contact-link")).click();
    }

    @Then("^Contact Details are Populated$")
    public void contact_Details_are_Populated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement contact = driver.findElement(By.xpath("//span[text()='Contact']"));
        String con = contact.getText();
        Assert.assertEquals("Contact", con);
    }
}
