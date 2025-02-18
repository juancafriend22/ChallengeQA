package com.nttdata.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoPagina extends PageObject {
    public static final Target CART_LIST = Target.the("Cart list").locatedBy(".cart_list");
    public static final Target CHECKOUT_BUTTON = Target.the("Checkout button").locatedBy("#checkout");
}
