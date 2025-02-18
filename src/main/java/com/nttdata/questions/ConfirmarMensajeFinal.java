package com.nttdata.questions;

import com.nttdata.ui.IngresoDatosPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmarMensajeFinal implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String message = TextContent.of(IngresoDatosPagina.CONFIRMATION_MESSAGE).answeredBy(actor);
        return message.contains("THANK YOU FOR YOUR ORDER");
    }

    public static Question<Boolean> value() {
        return new ConfirmarMensajeFinal();
    }

}
