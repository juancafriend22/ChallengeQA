package com.nttdata.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductosPagina extends PageObject {

    public static final Target PRODUCTS_LIST = Target.the("Lista Productos").located(By.id("inventory_container"));
    public static final Target CHOMPA = Target.the("CHOMPA PLOMA Y NEGRO").located(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    public static final Target CAMISETA = Target.the("CAMISETA NEGRA").located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    public static final Target CART_LINK = Target.the("Cart link").located(By.className("shopping_cart_link"));
}
