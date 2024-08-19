package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

public class windowHandle {
    String app = "https://rahulshettyacademy.com/AutomationPractice/";
    WebDriver driver;

    @Given("enter the window handle website")
    public void enter_the_window_handle_website() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver= new ChromeDriver(options);
        driver.get(app);
    }
    @When("click in window handle button")
    public void click_in_window_handle_button() {
        driver.findElement(By.id("openwindow")).click();
    }
    @Then("Navigate in the new window")
    public void navigate_in_the_new_window() {
        Set <String> window = driver.getWindowHandles();
        Iterator <String> IT = window.iterator();
        //según el orden del NEXT se abre las ventanas, no es necesario colocar la url de las paginas
        String principalWindow = (String) IT.next(); //para q vaya de la pagina principal al secundario
        String secondWindow = (String) IT.next(); //IT es el iterator

        //navegar entregar entre navegadores
        driver.switchTo().window(secondWindow);
        driver.findElement(By.xpath("(//a[normalize-space()='Courses'])[1]")).click();
        driver.switchTo().window(principalWindow);
        driver.findElement(By.id("name")).sendKeys("Janet");

    }
    @And("return principal window")
    public void return_principal_window() {
        driver.quit();
    }
    }
