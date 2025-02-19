package com.nttdata.stepdefinition;

import com.nttdata.questions.ConfirmarMensajeFinal;
import com.nttdata.questions.ProductosPaginaVisibles;
import com.nttdata.tasks.AgregarProductos;
import com.nttdata.tasks.IngresoDatos;
import com.nttdata.tasks.Login;
import com.nttdata.tasks.Navegacion;
import com.nttdata.ui.CarritoPagina;
import com.nttdata.ui.ProductosPagina;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AgregarProdStep {
    @Managed(driver = "edge")
    private WebDriver driver;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());

    }
    private Actor cliente = Actor.named("Cliente");


    @Given("que el usuario navega a la página de inicio de sesion")
    public void queElUsuarioNavegaALaPáginaDeInicioDeSesion() {
        cliente.can(BrowseTheWeb.with(driver));
        cliente.wasAbleTo(Navegacion.theSauceDemoPage());
    }
    @When("Ingresa las credenciales de acceso correctas")
    public void ingresaLasCredencialesDeAccesoCorrectas() {
        cliente.attemptsTo(Login.withCredentials("standard_user", "secret_sauce"));
    }
    @Then("deberia ver el catalogo de productos")
    public void deberiaVerElCatalogoDeProductos() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
