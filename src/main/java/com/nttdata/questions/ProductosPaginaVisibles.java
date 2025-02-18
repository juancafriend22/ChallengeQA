package com.nttdata.questions;

import com.nttdata.ui.ProductosPagina;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Visibility;

public class ProductosPaginaVisibles implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(ProductosPagina.PRODUCTS_LIST).answeredBy(actor).booleanValue();
    }

    public static Question<Boolean> value() {
        return new ProductosPaginaVisibles();
    }
}