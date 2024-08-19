package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alert {
    String app = "https://omayo.blogspot.com/";
    WebDriver driver;

    @Given("enter the website alertas en ventas")
    public void enter_the_website_alertas_en_ventas() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver= new ChromeDriver(options);
        driver.get(app);
    }
    @When("click in the principal button alerts")
    public void click_in_the_principal_button_alerts() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("alert1")).click();

        //como no se peude inspeccionar las alertas, por eso usamos lo siguiente:
        Alert alerta = driver.switchTo().alert();
        String mensaje = alerta.getText();
        System.out.println(mensaje);
        alerta.accept(); // cuando la alerta te pide botón aceptar, y deseas cliquearlo
        Thread.sleep(2000);

    }
    @Then("show windows alert and capture text")
    public void show_windows_alert_and_capture_text() {
        driver.quit();
    }

}
