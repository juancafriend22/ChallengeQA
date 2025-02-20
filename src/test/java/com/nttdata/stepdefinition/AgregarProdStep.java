package com.nttdata.stepdefinition;

import com.nttdata.questions.ConfirmarMensajeFinal;
import com.nttdata.tasks.AgregarProductos;
import com.nttdata.tasks.IngresoDatos;
import com.nttdata.tasks.Login;
import com.nttdata.tasks.Navegacion;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.rest.Ensure;
import net.serenitybdd.screenplay.actions.OpenPage;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

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
    @When("Ingresa las credenciales de acceso correctas {string} {string}")
    public void ingresaLasCredencialesDeAccesoCorrectas(String username, String password) {
        cliente.attemptsTo(Login.withCredentials(username,password));
    }

    @When("Agrega productos al carrito de compras")
    public void agregaProductosAlCarritoDeCompras() {
        cliente.attemptsTo(AgregarProductos.toCart());
    }

    @And("Hace click en el boton del carrito")
    public void haceClickEnElBotonDelCarrito() {
        // Este paso ya está incluido en agregaProductosAlCarritoDeCompras()
    }

    @When("Hace click en el boton checkout")
    public void haceClickEnElBotonCheckout() {
        //Este paso se realiza en completaElFormularioConSusDatos()
    }

    @And("Completa el formulario con sus datos {string} {string} {string}")
    public void completaElFormularioConSusDatos(String firstname, String lastname,String postcode) {
        cliente.attemptsTo(IngresoDatos.withInformation( firstname,lastname, postcode));
    }

    @And("Hace click en el boton continue")
    public void haceClickEnElBotonContinue() {
        //Este paso se realiza en completaElFormularioConSusDatos()
    }

    @And("hace clic en el botón finish")
    public void haceClicEnElBotónFinish() {
        //Este paso se realiza en completaElFormularioConSusDatos()
    }

    @Then("visualiza el mensaje {string}")
    public void visualizaElMensaje(String mensajeEsperado) {
        cliente.should(seeThat(ConfirmarMensajeFinal.muestra(mensajeEsperado)));
    }


}
