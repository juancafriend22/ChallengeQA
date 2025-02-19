package com.nttdata.tasks;

import com.nttdata.ui.ProductosPagina;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class AgregarProductos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductosPagina.CHOMPA),
                Click.on(ProductosPagina.CAMISETA),
                Click.on(ProductosPagina.CART_LINK)
        );
    }

    public static AgregarProductos toCart() {
        return Instrumented.instanceOf(AgregarProductos.class).withProperties();
    }
}
