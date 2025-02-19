package com.nttdata.tasks;

import com.nttdata.ui.LoginPagina;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.nttdata.ui.LoginPagina;

public class Login implements Task {
    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.username).into(LoginPagina.USERNAME_FIELD),
                Enter.theValue(this.password).into(LoginPagina.PASSWORD_FIELD),
                Click.on(LoginPagina.LOGIN_BUTTON)
        );
    }

    public static Login withCredentials(String username, String password) {
        return Instrumented.instanceOf(Login.class).withProperties(username, password);
    }
}

