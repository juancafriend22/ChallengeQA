package com.nttdata.tasks;
import com.nttdata.ui.CarritoPagina;
import com.nttdata.ui.IngresoDatosPagina;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.nttdata.ui.IngresoDatosPagina;

public class IngresoDatos implements Task {

    private final String firstName;
    private final String lastName;
    private final String postalCode;

    public IngresoDatos(String firstName, String lastName, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CarritoPagina.CHECKOUT_BUTTON),
                Enter.theValue(firstName).into(IngresoDatosPagina.FIRST_NAME_FIELD),
                Enter.theValue(lastName).into(IngresoDatosPagina.LAST_NAME_FIELD),
                Enter.theValue(postalCode).into(IngresoDatosPagina.POSTAL_CODE_FIELD),
                Click.on(IngresoDatosPagina.CONTINUE_BUTTON),
                Click.on(IngresoDatosPagina.FINISH_BUTTON)
        );
    }

    public static IngresoDatos withInformation(String firstName, String lastName, String postalCode) {
        return Instrumented.instanceOf(IngresoDatos.class).withProperties(firstName, lastName, postalCode);
    }
}
