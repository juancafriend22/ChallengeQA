package com.nttdata.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresoDatosPagina extends PageObject {
    public static final Target FIRST_NAME_FIELD = Target.the("First name field").located(By.id("first-name"));
    public static final Target LAST_NAME_FIELD = Target.the("Last name field").located(By.id("last-name"));
    public static final Target POSTAL_CODE_FIELD = Target.the("Postal code field").located(By.id("postal-code"));
    public static final Target CONTINUE_BUTTON = Target.the("Continue button").located(By.id("continue"));
    public static final Target FINISH_BUTTON = Target.the("Finish button").located(By.id("finish"));
    public static final Target CONFIRMATION_MESSAGE = Target.the("Confirmation message").located(By.className("complete-header"));
}
