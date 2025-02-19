package com.nttdata.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPagina extends PageObject {
    public static final Target CHECKOUT_BUTTON = Target.the("Checkout button").located(By.id("checkout"));
}
