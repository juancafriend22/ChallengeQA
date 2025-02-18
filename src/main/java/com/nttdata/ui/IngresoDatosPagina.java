package com.nttdata.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class IngresoDatosPagina extends PageObject {
    public static final Target FIRST_NAME_FIELD = Target.the("First name field").locatedBy("#first-name");
    public static final Target LAST_NAME_FIELD = Target.the("Last name field").locatedBy("#last-name");
    public static final Target POSTAL_CODE_FIELD = Target.the("Postal code field").locatedBy("#postal-code");
    public static final Target CONTINUE_BUTTON = Target.the("Continue button").locatedBy("#continue");
    public static final Target FINISH_BUTTON = Target.the("Finish button").locatedBy("#finish");
    public static final Target CONFIRMATION_MESSAGE = Target.the("Confirmation message").locatedBy(".complete-header");
}
