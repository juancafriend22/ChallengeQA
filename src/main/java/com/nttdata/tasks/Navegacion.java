package com.nttdata.tasks;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


public class Navegacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.saucedemo.com/")
        );
    }

    public static Navegacion theSauceDemoPage() {
        return Instrumented.instanceOf(Navegacion.class).withProperties();
    }
}
