package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class subirArchivo {
    String app = "https://nervgh.github.io/pages/angular-file-upload/examples/simple/";
    WebDriver driver;

    @Given("enter the button upload")
    public void enter_the_button_upload() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver= new ChromeDriver(options);
        driver.get(app);
    }
    @When("select document text")
    public void select_document_text() {
       driver.findElement(By.xpath("//input[@uploader='uploader'][1]")).sendKeys("C:\\Users\\MP2N6PHV\\Desktop\\ejercicio.txt");
    }
    @Then("show message the document text")
    public void show_message_the_document_text() {


    }
}
