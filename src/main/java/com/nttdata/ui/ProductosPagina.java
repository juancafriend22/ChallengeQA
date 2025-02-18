package com.nttdata.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductosPagina extends PageObject {

    public static final Target PRODUCTS_LIST = Target.the("Lista Productos").locatedBy("inventory_container");
    public static final Target CAMISETA = Target.the("Backpack add button").locatedBy("#add-to-cart-test\\.allthethings\\(\\)-t-shirt-\\(red\\)");
    public static final Target CHAQUETA = Target.the("Bikelight add button").locatedBy("add-to-cart-sauce-labs-fleece-jacket");
    public static final Target CART_LINK = Target.the("Cart link").locatedBy(".shopping_cart_link");
}
