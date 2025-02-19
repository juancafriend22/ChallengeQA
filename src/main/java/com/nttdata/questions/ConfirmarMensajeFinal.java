package com.nttdata.questions;

import com.nttdata.ui.IngresoDatosPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmarMensajeFinal implements Question<Boolean> {
    private String mensajeEsperado;

    public ConfirmarMensajeFinal(String mensajeEsperado) {
        this.mensajeEsperado = mensajeEsperado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajeActual = TextContent.of(IngresoDatosPagina.CONFIRMATION_MESSAGE).answeredBy(actor);
        System.out.println("Mensaje Actual: '" + mensajeActual + "'");
        System.out.println("Mensaje Esperado: '" + mensajeEsperado + "'");
        return mensajeActual.equals(mensajeEsperado);
    }
    public static Question<Boolean> muestra(String mensaje) {
        return new ConfirmarMensajeFinal(mensaje);
    }

}


