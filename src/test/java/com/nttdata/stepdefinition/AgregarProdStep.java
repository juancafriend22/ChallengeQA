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

    @Given("Usuario esta en la pagina de logueo")
    public void usuarioEnPaginaLogueo() {
        cliente.can(BrowseTheWeb.with(driver));
        cliente.wasAbleTo(Navegacion.theSauceDemoPage());
    }

    @When("El usuario tipea su username en el campo {string}")
    public void ingresarUsername(String username) {
        this.username = username;
    }

    @When("El usuario tipea su contrasena en el campo {string}")
    public void ingresarPassword(String password) {
        cliente.attemptsTo(Login.withCredentials(username, password));
    }

    private String username;

    @When("El usuario presiona el boton login")
    public void clickLogin() {
        // Login ya realizado en el paso anterior
    }

    @Then("El usuario visualiza la pagina de productos disponibles")
    public void verificarPaginaProductos() {
        cliente.should(
                Ensure.that(ProductosPaginaVisibles.value()).isTrue().toString()
        );
    }

    @When("El usuario agrega productos al carrito")
    public void agregarProductos() {
        cliente.attemptsTo(AgregarProductos.toCart());
    }

    @When("El usuario va ver el carrito")
    public void irAlCarrito() {
        cliente.attemptsTo(Click.on(ProductosPagina.CART_LINK));
    }

    @Then("El usuario visualiza su lista de productos comprados")
    public void verificarListaProductos() {
        cliente.should(
                Ensure.that(CarritoPagina.CART_LIST).isDisplayed().toString()
        );
    }

    @When("El usuario confirma su compra presionando el boton checkout")
    public void clickCheckout() {
        cliente.attemptsTo(Click.on(CarritoPagina.CHECKOUT_BUTTON));
    }

    @When("Ingresa sus datos de compra {string} {string} {string}")
    public void ingresarDatosCompra(String firstName, String lastName, String postalCode) {
        cliente.attemptsTo(
                IngresoDatos.withInformation(firstName, lastName, postalCode)
        );
    }

    @Then("El usuario visualiza un mensaje de confirmación de compra")
    public void verificarConfirmacion() {
        cliente.should(
                Ensure.that(ConfirmarMensajeFinal.value()).isTrue().toString()
        );
    }

}
